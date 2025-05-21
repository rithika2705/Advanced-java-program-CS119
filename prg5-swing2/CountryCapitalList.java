/*
 5c. Develop a Swing program in Java to add the countries USA, India, Vietnam, Canada,
Denmark, France, Great Britain, Japan, Africa, Greenland, Singapore into a JList and
display the capital of the countries on console whenever the countries are selected on the list.
o/p

 */
package swingprogrmas;
import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.util.*;
import java.util.List;     
public class CountryCapitalList {
	public static void main(String[] args) {
        // Create frame
        JFrame frame = new JFrame("Country and Capital Viewer");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(400, 300);
        frame.setLayout(new FlowLayout());

        // Countries and their capitals
        String[] countries = {
            "USA", "India", "Vietnam", "Canada", "Denmark",
            "France", "Great Britain", "Japan", "Africa", "Greenland", "Singapore"
        };

        Map<String, String> capitalMap = new HashMap<>();
        capitalMap.put("USA", "Washington, D.C.");
        capitalMap.put("India", "New Delhi");
        capitalMap.put("Vietnam", "Hanoi");
        capitalMap.put("Canada", "Ottawa");
        capitalMap.put("Denmark", "Copenhagen");
        capitalMap.put("France", "Paris");
        capitalMap.put("Great Britain", "London");
        capitalMap.put("Japan", "Tokyo");
        capitalMap.put("Africa", "Varies by country");  // Africa is a continent
        capitalMap.put("Greenland", "Nuuk");
        capitalMap.put("Singapore", "Singapore");

        // Create JList
        JList<String> countryList = new JList<>(countries);
        countryList.setVisibleRowCount(8);
        countryList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        JScrollPane scrollPane = new JScrollPane(countryList);

        // Add ListSelectionListener
        countryList.addListSelectionListener(new ListSelectionListener() {
            public void valueChanged(ListSelectionEvent e) {
                if (!e.getValueIsAdjusting()) {
                    List<String> selectedCountries = countryList.getSelectedValuesList();
                    System.out.println("Selected Capitals:");
                    for (String country : selectedCountries) {
                        System.out.println(country + " → " + capitalMap.get(country));
                    }
                    System.out.println();
                }
            }
        });

        // Add components to frame
        frame.add(new JLabel("Select Countries:"));
        frame.add(scrollPane);

        frame.setVisible(true);
    }
}