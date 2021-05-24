import com.teamdev.jxmaps.*;
import com.teamdev.jxmaps.swing.MapView;

import javax.swing.*;
import java.awt.*;

public class Mapa extends MapView {
    private Map map;


    public Mapa(String nName) {
        JFrame frame = new JFrame(nName);
        setOnMapReadyHandler(new MapReadyHandler() {
            @Override
            public void onMapReady(MapStatus mapStatus) {
                if (mapStatus == MapStatus.MAP_STATUS_OK) {
                    map = getMap();
                    MapOptions mapOptions = new MapOptions();
                    MapTypeControlOptions mapTypeControlOptions = new MapTypeControlOptions();
                    mapOptions.setMapTypeControlOptions(mapTypeControlOptions);
                    map.setOptions(mapOptions);
                    map.setCenter(new LatLng(41.14214, -87.48010));
                    map.setZoom(11);
                }

            }
        });
        frame.add(this, BorderLayout.CENTER);
        frame.setSize(700, 500);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        Mapa temp = new Mapa("Google map");
      //  temp.setVisible(true);


    }
}
