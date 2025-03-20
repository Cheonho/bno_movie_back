package com.bno.movie.util;

import com.github.f4b6a3.tsid.TsidFactory;

import java.time.Clock;
import java.time.ZoneId;
import java.util.concurrent.ThreadLocalRandom;

public class TsidUtil {

    public static String TSID_TZ = "tsid.tz";
    public static String TSID_BIT = "tsid.bit";

    private static final TsidFactory TSID_FACTORY;

    static {
        String tz = System.getProperty(TSID_TZ);
        int bit = Integer.parseInt(System.getProperty(TSID_BIT));

        Clock clock = Clock.system(ZoneId.of(tz));

        TSID_FACTORY = TsidFactory.builder()
                .withClock(clock)
                .withNodeBits(bit)
                .withRandomFunction(() -> ThreadLocalRandom.current().nextInt())
                .build();
    }

    public static String getTsid() {
        return TSID_FACTORY.create().toString();
    }
}
