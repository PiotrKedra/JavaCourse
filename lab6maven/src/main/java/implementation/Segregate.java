package implementation;

import io.indico.Indico;
import io.indico.api.results.IndicoResult;
import io.indico.api.utils.IndicoException;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.Iterator;
import java.util.Map;

import static java.nio.file.StandardCopyOption.REPLACE_EXISTING;

public class Segregate {
    static private String _curent_dir;
    private String _classified_dir;
    private Indico _indico;

    public Segregate() throws IndicoException{
        this._indico = new Indico("c18b2d12a84362fcd3937a08467d457b");
    }

    public void set_curent_dir(String _curent_dir) {
        Segregate._curent_dir = _curent_dir;
    }

    public void classify(String path) throws IOException, IndicoException{
        IndicoResult single = _indico.imageRecognition.predict(path);
        Map<String,Double> result_map = single.getImageRecognition();

        Double max_value = Collections.max(result_map.values());

        for(Iterator<Map.Entry<String,Double>> it=result_map.entrySet().iterator();it.hasNext();){
            Map.Entry<String,Double> elem = it.next();
            if(elem.getValue().equals(max_value)){
                _classified_dir = elem.getKey();
                return;
            }
        }
    }

    private boolean checkIfClassifiedDirExist(){
        return new File(_curent_dir + '\\' + _classified_dir).exists();
    }

    public void move(String path) throws IOException{
        if(!checkIfClassifiedDirExist()) {
            File new_dir = new File(_curent_dir + '\\' + _classified_dir);
            new_dir.mkdirs();
        }
        Files.move(Paths.get(_curent_dir + '\\' + path),
                Paths.get(_curent_dir + '\\' + _classified_dir + '\\' + path), REPLACE_EXISTING);
    }

}
