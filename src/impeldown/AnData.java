package impeldown;

import io.github.kensuke1984.kibrary.util.HorizontalPosition;
import io.github.kensuke1984.kibrary.util.Location;
import io.github.kensuke1984.kibrary.util.globalcmt.GlobalCMTID;
import io.github.kensuke1984.kibrary.util.globalcmt.GlobalCMTSearch;

import java.time.LocalDate;
import java.util.List;
import java.util.Set;

class AnData {

    public static void main(String[] args) {
        System.out.println(eventList().size());
    }

    private static HorizontalPosition usCenter = new HorizontalPosition(40, -100);

    private static Set<GlobalCMTID> eventList() {
        return GlobalCMTSearch.search(d -> d.getCmtLocation().getEpicentralDistance(usCenter) < 80
                && d.getCMTTime().isAfter(LocalDate.of(2000, 1, 1).atTime(0, 0)));
    }

}
