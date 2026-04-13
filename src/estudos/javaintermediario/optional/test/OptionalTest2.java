package src.estudos.javaintermediario.optional.test;

import java.util.Optional;

import src.estudos.javaintermediario.optional.domain.Manga;
import src.estudos.javaintermediario.optional.repository.MangaRepository;

public class OptionalTest2 {
    public static void main(String[] args) {
        // busca o manga, que rwetrna um optional
        Optional<Manga> findyByTitle = MangaRepository.findyByTitle("berserk");

        // caso o optional exista, muda o valor do titulo
        findyByTitle.ifPresent(m -> m.settitle("onepiece"));

        System.out.println(findyByTitle);

        // orelseTrow desempacota o manga d dentro do optional e retorna um manga inves de optional
        Manga findyById = MangaRepository.findyById(2).orElseThrow(IllegalArgumentException::new);
        
        System.out.println(findyById);


        // orElseGet, so cria o objeto caso ele não exista, usa supplier, que não recebe nada mas retorna um valor
        Manga findNew = MangaRepository.findyByTitle("jujutsu").orElseGet(()-> new Manga(3, "jujutsu", 100));
        System.out.println(findNew);
    }
}
