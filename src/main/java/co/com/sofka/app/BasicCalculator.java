package co.com.sofka.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class BasicCalculator {

    private static final Logger logger = LoggerFactory.getLogger(BasicCalculator.class);

    public Long sum(Long number1, Long number2) {
        logger.info( "Summing {} + {}", number1, number2 );
        return number1 + number2;
    }

    //TODO: RESTA, MULTIPLICACION Y DIVISION

    public Long resta(long number1, long number2){
        logger.info( "Subtracting {} - {}", number1, number2);
        return number1 - number2;
    }

    public Float multiplicacion(float number1, float number2){
        logger.info( "Multiplying {} * {}", number1, number2);
        return number1*number2;
    }

    public Long division(long number1, long number2){
        try{
            logger.info( "Dividing {} / {}", number1, number2);
            return number1/number2;
        }
        catch(ArithmeticException e){
            logger.info("No se puede dividir entre 0");
            return 0L;
        }
    }
}
