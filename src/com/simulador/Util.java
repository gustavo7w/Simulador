package com.simulador;

import java.util.Random;

class Util
{
    static int calculateDefaultNecessaryTimeInMinutes()
    {
        Random rand = new Random();
        int probability = rand.nextInt(100) + 1;

        if (probability <= 1)
        {
            return randomBeetwen(307, 344);
        } else if (probability > 1 && probability <= 4)
        {
            return randomBeetwen(345, 600);
        } else if (probability > 4 && probability <= 9)
        {
            return randomBeetwen(153, 268);
        } else if (probability > 9 && probability <= 22)
        {
            return randomBeetwen(76, 152);
        } else if (probability > 22 && probability <= 40)
        {
            return randomBeetwen(38, 76);
        } else
        {
            return randomBeetwen(0, 38);
        }
    }

    private static int randomBeetwen(int max, int min)
    {
        return min + (int) (Math.random() * ((max - min) + 1));
    }
}

//        1% chance of 307 to 344
//        3% chance of 345 >
//        5% chance of 153 to 268
//        12% chance of 76 to 153
//        17% chance of 38 to 76
//        61% chance of 0 to 38
