package com.example.moviecataloguejetpackpro.utils

import com.example.moviecataloguejetpackpro.data.source.local.entity.MovieEntity
import com.example.moviecataloguejetpackpro.data.source.local.entity.MovieEntityLocal
import com.example.moviecataloguejetpackpro.data.source.local.entity.TVShowEntity
import com.example.moviecataloguejetpackpro.data.source.local.entity.TvShowEntityLocal

object DataDummy {
    fun generateDummyMovies(): List<MovieEntityLocal> {
        val movies = ArrayList<MovieEntityLocal>()

        val genreIds: List<Int> = mutableListOf(1, 2, 3)

        movies.add(
            MovieEntityLocal(
                1,
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "Aquaman",
                "/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                "12/21/2018 (US)",
                7.5,
                false,
            )
        )
        movies.add(
            MovieEntityLocal(
                2,
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "Cruella",
                "/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                "12/21/2018 (US)",
                7.5,
                false,
            )
        )
        movies.add(
            MovieEntityLocal(
                3,
                "Once home to the most advanced civilization on Earth, Atlantis is now an underwater kingdom ruled by the power-hungry King Orm. With a vast army at his disposal, Orm plans to conquer the remaining oceanic people and then the surface world. Standing in his way is Arthur Curry, Orm's half-human, half-Atlantean brother and true heir to the throne.",
                "Batman",
                "/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                "12/21/2018 (US)",
                7.5,
                false,
            )
        )

        return movies
    }

    fun generateDummyTVShows(): List<TvShowEntityLocal> {
        val tvShows = ArrayList<TvShowEntityLocal>()

        tvShows.add(
            TvShowEntityLocal(
                1,
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                8.1,
                "Loki",
                false,
            )
        )
        tvShows.add(
            TvShowEntityLocal(
                2,
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                8.1,
                "The Flash",
                false,
            )
        )
        tvShows.add(
            TvShowEntityLocal(
                3,
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "Spoiled billionaire playboy Oliver Queen is missing and presumed dead when his yacht is lost at sea. He returns five years later a changed man, determined to clean up the city as a hooded vigilante armed with a bow.",
                "/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                8.1,
                "Rick and Morty",
                false,
            )
        )

        return tvShows
    }

    fun generateDummyDataMovies(): List<MovieEntity> {
        val movies = ArrayList<MovieEntity>()

        val genreIds: List<Int> = mutableListOf(1, 2, 3)

        movies.add(
            MovieEntity(
                "When LeBron and his young son Dom are trapped in a digital space by a rogue A.I., LeBron must get them home safe by leading Bugs, Lola Bunny and the whole gang of notoriously undisciplined Looney Tunes to victory over the A.I.'s digitized champions on the court. It's Tunes versus Goons in the highest-stakes challenge of his life.",
                "When LeBron and his young son Dom are trapped in a digital space by a rogue A.I., LeBron must get them home safe by leading Bugs, Lola Bunny and the whole gang of notoriously undisciplined Looney Tunes to victory over the A.I.'s digitized champions on the court. It's Tunes versus Goons in the highest-stakes challenge of his life.",
                "Space Jam: A New Legacy",
                false,
                "Space Jam: A New Legacy",
                genreIds,
                "https://image.tmdb.org/t/p/w500/hjS9mH8KvRiGHgjk6VUZH7OT0Ng.jpg",
                "/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                "2021-07-08",
                1897.772,
                0.0,
                460465,
                false,
                3036
            )
        )
        movies.add(
            MovieEntity(
                "Paranormal investigators Ed and Lorraine Warren encounter what would become one of the most sensational cases from their files. The fight for the soul of a young boy takes them beyond anything they'd ever seen before, to mark the first time in U.S. history that a murder suspect would claim demonic possession as a defense.",
                "en",
                "The Conjuring: The Devil Made Me Do It",
                false,
                "The Conjuring: The Devil Made Me Do It",
                genreIds,
                "https://image.tmdb.org/t/p/w500/hjS9mH8KvRiGHgjk6VUZH7OT0Ng.jpg",
                "/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                "2021-05-25",
                1897.772,
                8.1,
                460465,
                false,
                3036
            )
        )
        movies.add(
            MovieEntity(
                "Following the events at home, the Abbott family now face the terrors of the outside world. Forced to venture into the unknown, they realize that the creatures that hunt by sound are not the only threats that lurk beyond the sand path.",
                "en",
                "A Quiet Place Part II",
                false,
                "A Quiet Place Part II",
                genreIds,
                "https://image.tmdb.org/t/p/w500/hjS9mH8KvRiGHgjk6VUZH7OT0Ng.jpg",
                "/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                "2021-05-21",
                1897.772,
                7.3,
                460465,
                false,
                3036
            )
        )

        return movies

    }

    fun generateDummyDataTVShows(): List<TVShowEntity> {
        val tvShows = ArrayList<TVShowEntity>()

        val genreIds: List<Int> = mutableListOf(1, 2, 3)
        val originalCountry: List<String> = mutableListOf("US")

        tvShows.add(
            TVShowEntity(
                "2005-02-06",
                "The series focuses on an eccentric motley crew that is the Smith family and their three housemates: Father, husband, and breadwinner Stan Smith; his better half housewife, Francine Smith; their college-aged daughter, Hayley Smith; and their high-school-aged son, Steve Smith. Outside of the Smith family, there are three additional main characters, including Hayley's boyfriend turned husband, Jeff Fischer; the family's man-in-a-goldfish-body pet, Klaus; and most notably the family's zany alien, Roger, who is \"full of masquerades, brazenness, and shocking antics.\"",
                "en",
                genreIds,
                "https://image.tmdb.org/t/p/w500/hjS9mH8KvRiGHgjk6VUZH7OT0Ng.jpg",
                originalCountry,
                "/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                "American Dad!",
                6982.349,
                6.8,
                "American Dad!",
                84958,
                3271
            )
        )
        tvShows.add(
            TVShowEntity(
                "2021-02-23",
                "After a particle accelerator causes a freak storm, CSI Investigator Barry Allen is struck by lightning and falls into a coma. Months later he awakens with the power of super speed, granting him the ability to move through Central City like an unseen guardian angel. Though initially excited by his newfound powers, Barry is shocked to discover he is not the only &quotmeta-human&quot who was created in the wake of the accelerator explosion -- and not everyone is using their new powers for good. Barry partners with S.T.A.R. Labs and dedicates his life to protect the innocent. For now, only a few close friends and associates know that Barry is literally the fastest man alive, but it won't be long before the world learns what Barry Allen has become...The Flash.",
                "en",
                genreIds,
                "https://image.tmdb.org/t/p/w500/hjS9mH8KvRiGHgjk6VUZH7OT0Ng.jpg",
                originalCountry,
                "/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                "The Flash",
                6982.349,
                7.7,
                "The Flash",
                84958,
                3271
            )
        )
        tvShows.add(
            TVShowEntity(
                "2013-12-02",
                "After years of facing megalomaniacal supervillains, monsters wreaking havoc on Metropolis, and alien invaders intent on wiping out the human race, The Man of Steel aka Clark Kent and Lois Lane come face to face with one of their greatest challenges ever: dealing with all the stress, pressures and complexities that come with being working parents in today's society.",
                "en",
                genreIds,
                "https://image.tmdb.org/t/p/w500/hjS9mH8KvRiGHgjk6VUZH7OT0Ng.jpg",
                originalCountry,
                "/9yBVqNruk6Ykrwc32qrK2TIE5xw.jpg",
                "Superman & Lois",
                6982.349,
                8.3,
                "Superman & Lois",
                84958,
                3271
            )
        )

        return tvShows
    }

    fun generateDummyMovie(
        movieEntityLocal: MovieEntityLocal,
        bookmarked: Boolean,
    ): MovieEntityLocal {
        movieEntityLocal.bookmarked = bookmarked
        return movieEntityLocal
    }

    fun generateDummyTvShow(
        tvShowEntityLocal: TvShowEntityLocal,
        bookmarked: Boolean,
    ): TvShowEntityLocal {
        tvShowEntityLocal.bookmarked = bookmarked
        return tvShowEntityLocal
    }
}
