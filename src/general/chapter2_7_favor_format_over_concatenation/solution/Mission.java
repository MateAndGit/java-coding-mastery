package general.chapter2_7_favor_format_over_concatenation.solution;

import general.chapter2_7_favor_format_over_concatenation.Logbook;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

class Mission {

    Logbook logbook;
    LocalDate start;

    // 문자열이 길면 StringTemplate을 사용하자
    void update(String author, String message) {
        final LocalDate today = LocalDate.now();
        String entry = String.format("%S: [%tm-%<te-%<tY](Day %d)> %s%n",
                author, today,
                ChronoUnit.DAYS.between(start, today) + 1, message);
        logbook.write(entry);
    }
}

class Usage {
    static void main(String[] args) {
        new Mission().update("LInUS", "message");
    }
}