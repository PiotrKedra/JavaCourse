import io.indico.Indico;
import io.indico.api.image.FacialEmotion;
import io.indico.api.results.BatchIndicoResult;
import io.indico.api.results.IndicoResult;
import io.indico.api.utils.IndicoException;

import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {
    public static void main(String[] args) {

            Indico indico = new Indico("38c374e41d1a4c52971eac0ba06b18db");

            try {
                System.out.println(indico.fer.predict(new File("C:\\Users\\piotr\\Desktop\\Klusek\\IMG_20161031_213819.jpg")));
            }catch (IOException e){
                e.printStackTrace();
            }catch (IndicoException e){
                e.printStackTrace();
            }

        /*// batch example
        String[] example = {
                "<IMAGE>",
                "<IMAGE>"
        };
        BatchIndicoResult multiple = indico.imageRecognition.predict(example);
        List<Double> results = multiple.getImageRecognition();
        System.out.println(results);*/
    }
}
