package src.estudos.javaintermediario.optional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest1 {
    public static void main(String[] args) {
        //String name = findName("shipin");

        // 3 formas de usar o optional
        Optional<String> o1 = Optional.of("teste");
        Optional<String> o2 = Optional.ofNullable(null);
        Optional<String> o3 = Optional.empty();

        // encapsula no optional
        //Optional<String> nameOptional = Optional.ofNullable(findName("shipin"));
        // caso seja null, retorna empty, caso não, retorna o nome
        //String empty = nameOptional.orElse("EMPTY");
        //System.out.println(empty);

        // se existir, deixax maiusculo
        //nameOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    private static Optional<String> findName(String name){
        List<String> list = List.of("shipin", "shipino", "shipo");

        int index = list.indexOf(name);

        if (index != -1) {
            return Optional.of(list.get(index)); 
        }
        return Optional.empty();
    }
}
