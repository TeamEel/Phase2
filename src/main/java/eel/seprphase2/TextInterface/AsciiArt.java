package eel.seprphase2.TextInterface;

/**
 * ASCII Art Pictures
 *
 * @author David
 */
public class AsciiArt {

    /**
     * Write a diagram of the plant to the output
     *
     * @param renderer the output module to use
     */
    public static void diagram(TextRenderer renderer) {
        renderer.outputLine("");
        renderer.outputLine("");
        renderer.outputLine("                                             TURBINE  /----+\n" +
                            "                                          /-----------|    |    GENERATOR\n" +
                            "                   Valve 1          +-----|  |  |  |  |    |    +-------+\n" +
                            "     +-----------------------------+|  |  |  |  |  |  |    |    |       |\n" +
                            "     |               (X)               +--+--+--+--+--+--+-+----+       |\n" +
                            "     |   +-------------------------+|  |  |  |  |  |  |    |    |       |\n" +
                            "     |   |      ---------->         +-----|  |  |  |  |    |    +-------+\n" +
                            "     |   |                                \\---------- |    |\n" +
                            "+----+   +-----+                                     \\+   ++\n" +
                            "|              |                                      |   |\n" +
                            "|   Control    |                                      |(X)| Valve 2\n" +
                            "|    Rods      |                                      |   |\n" +
                            "|  +--+--+--+  |                               +------+   ++\n" +
                            "|  |  |  |  |  |                               |           |\n" +
                            "|  |  |  |  |  |                               +^-^-^-^-^-^+   <----\n" +
                            "|++|++|++|++|++|                               |    +------+-------------\n" +
                            "||||||||||||||||         <---------            |    | Secondary Coolant\n" +
                            "|||||||||||||||+-------------------------------+    |  +---+-------------\n" +
                            "||| || || || ||          ( PUMP 1 )                 |  +---+-------------\n" +
                            "||| || || || ||+-------------------------------+    |      | ( PUMP 2 )\n" +
                            "|++ ++ ++ ++ ++|         <---------            |    +------+-------------\n" +
                            "+--------------+                               +-----------+  ----->\n" +
                            "    REACTOR                                      CONDENSER\n");
        renderer.outputLine("");
        renderer.outputLine("");
    }

    /**
     * Write a picture of a mushroom cloud to the output
     *
     * @param renderer the output module to use
     */
    public static void mushroomCloud(TextRenderer renderer) {
        renderer.outputLine("");
        renderer.outputLine("");
        renderer.outputLine("                           ---   .\n" +
                            "                . ...  ... m *m++--+....\n" +
                            "           . .. .m +-+-..m.+mm+..*+m-#mm--. .\n" +
                            "           ..+%.*--%mm#-%##*#######-%+m-m+%m++.\n" +
                            "     - - -+.-.-.#*########*###*%*########%*-*-.-.\n" +
                            "   . +*-.+m #*#+*-####%#%#-#mm#-*####%*#####m*.-...\n" +
                            "  ..--+.*###m##*##+######%-#+##mm#m-#%#%*m#####+m-  .\n" +
                            "  +--%##########*#%##########*###%-#*##-*%m## ##%%..\n" +
                            " m+%####%%%*m**#%m############*##+#*####--%%###+m#- ...\n" +
                            "--#%#%## ##+m#########*#m####%####m###*#%++-*##*%#++% .\n" +
                            ".++#*##%m###%+###m*####m%*#%#+####%+#####%.-+#*#--#*# + .\n" +
                            "%-##%####.++-%#**##m#**#-+-m*++m######*#%.-m+.m#+m%-#. .-\n" +
                            "%####*#m.m-#m-%#########m-##+#m%#########%.-*m+*-m---+++--\n" +
                            "*#%####m%%.-.#######%######*#########*#m*+m%m+#%m-.+.#m. .\n" +
                            "%##mm####%%##m+%*#*+##m##*###%.#*####-#m.#%+**%..  ---#%m\n" +
                            "m##- m#+%#m+################**###########+**%+-+  -.*#-#+.-\n" +
                            "-*###*%*%+m+-#%##############*#**#m+*m%%-.%..+-.  --m%%#-.\n" +
                            "- -+.m*#####*%##############%###**%m++.#*%#--+.  . #-#*# -\n" +
                            " - + -m*-+..%m###############%######%#m*m*m##+   . # .m+\n" +
                            " . +.- #-+ m.**+##m*%m**####*##%m+#%--%--  *-     .+. .-.\n" +
                            "                   + ###########+##*+.\n" +
                            "                    +mm#####*##*+##mm\n" +
                            "                     +######%#%+%#*--\n" +
                            "                     - #######*+### +\n" +
                            "                    .%###########m--\n" +
                            "                    -m*#####m#m%-mm+\n" +
                            "                    m+%####m##m#m#- +\n" +
                            "                    --##-##-+#++.#-\n" +
                            "                    +m%#m#m*#m+-%m. .\n" +
                            "                   ++.######*m -#+-.\n" +
                            "                  .++#######*%+-m.-\n" +
                            "                .--m##########m-++..\n" +
                            "             %+.+m################m.\n" +
                            "        -+---*.mm%+##############m-..m.-.++\n" +
                            "       -m%##%######m##############m%%.*-*++-+\n" +
                            "      .m###%m#######################%+-###**.\n" +
                            "      .. --%#.+%+#m%###*+###m#*##+-..%#*m** -\n" +
                            "         m.- +-m.+%*+*+m*.m+mm*%-+- --\n");
        renderer.outputLine("");
        renderer.outputLine("");
    }
}
