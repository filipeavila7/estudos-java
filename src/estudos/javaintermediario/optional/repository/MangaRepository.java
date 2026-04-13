package src.estudos.javaintermediario.optional.repository;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;

import src.estudos.javaintermediario.optional.domain.Manga;

public class MangaRepository {
    private static List<Manga> mangas = List.of(new Manga(1, "berserk", 300),
new Manga(2, "bleach", 350));


public static Optional<Manga> findyByTitle(String title){
    return findBy(m -> m.gettitle().equals(title));
}

public static Optional<Manga> findyById(Integer id){
    return findBy(m -> m.getId().equals(id));
}

private static Optional<Manga> findBy(Predicate<Manga> predicate){
    Manga found = null;

    for (Manga manga : mangas) {
        if (predicate.test(manga)) {
            found = manga;
        }
    }

    return Optional.ofNullable(found);
}




}
