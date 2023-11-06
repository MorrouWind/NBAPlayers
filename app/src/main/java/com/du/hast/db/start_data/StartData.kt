package com.du.hast.db.start_data

import com.du.hast.R
import com.du.hast.db.entity.PlayerEntity

class StartData {
    fun getDefaultData() : List<PlayerEntity> {
        return listOf(
            PlayerEntity(
                name = "LeBron James",
                descr = "Known as \"King James,\" LeBron is a four-time NBA champion and four-time NBA MVP. He has been a dominant force in the league for over a decade, known for his versatility, scoring ability, and leadership.",
                image = R.drawable.lebron_james
            ),
            PlayerEntity(
                name = "Kevin Durant",
                descr = "Durant is a two-time NBA champion and a former MVP. He's one of the most prolific scorers in NBA history, with a unique combination of height, shooting skill, and athleticism.",
                image = R.drawable.kevin_durant
            ),
            PlayerEntity(
                name = "Stephen Curry",
                descr = "Curry revolutionized the game with his three-point shooting. He's a two-time MVP and three-time NBA champion, known for his incredible shooting range and ball-handling skills.",
                image = R.drawable.stephen_curry
            ),
            PlayerEntity(
                name = "Kawhi Leonard",
                descr = "Leonard is a two-time NBA Finals MVP and a two-time NBA champion. He's widely regarded as one of the best two-way players in the league due to his defensive prowess and scoring ability.",
                image = R.drawable.kawhi_leonard
            ),
            PlayerEntity(
                name = "Giannis Antetokounmpo",
                descr = "Known as the \"Greek Freak,\" Giannis is a two-time MVP and a NBA champion. His athleticism, versatility, and ability to dominate both ends of the floor make him a standout player.",
                image = R.drawable.giannis_antetokounmpo
            ),
            PlayerEntity(
                name = "James Harden",
                descr = "Harden is a former MVP and one of the league's premier scorers. He's known for his scoring ability, ball-handling, and drawing fouls to get to the free-throw line.",
                image = R.drawable.james_harden
            ),
            PlayerEntity(
                name = "Anthony Davis",
                descr = "Davis is a highly versatile big man who excels on both ends of the court. He's a multiple-time NBA All-Star and won an NBA championship with the Los Angeles Lakers in 2020.",
                image = R.drawable.anthony_davis
            ),
            PlayerEntity(
                name = "Russell Westbrook",
                descr = "Westbrook is known for his triple-double ability and fierce competitiveness. He's a former MVP and has consistently been among the league's top players in terms of statistical production.",
                image = R.drawable.russell_westbrook
            ),
            PlayerEntity(
                name = "Damian Lillard",
                descr = "Lillard, also known as \"Dame,\" is a dynamic point guard with deep shooting range. He's been a multiple-time NBA All-Star and is known for his clutch performances in critical moments.",
                image = R.drawable.damian_lillard
            ),
            PlayerEntity(
                name = "Chris Paul",
                descr = "Paul, often referred to as CP3, is one of the greatest point guards in NBA history. He's known for his court vision, leadership, and ability to elevate his team's performance. Although he hadn't won an NBA championship by 2020, he had a significant impact on every team he played for.",
                image = R.drawable.chris_paul
            )
        )
    }
}