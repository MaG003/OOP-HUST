package hust.soict.hedspi.test.media;

import java.util.Iterator;
import java.util.List;

import hust.soict.hedspi.aims.media.Media;
import hust.soict.hedspi.aims.media.book.Book;
import hust.soict.hedspi.aims.media.disc.CompactDisc;
import hust.soict.hedspi.aims.media.disc.DigitalVideoDisc;

public class TestMediaCompareTo {
    public static void main(String[] args) {
        
    }
    private static void display(java.util.Collection<Media> collection) {
		Iterator<Media> iterator = collection.iterator();
		iterator = collection.iterator();
        System.out.println("-------------------------------------");
        System.out.println("The medias currently in the order are: ");
		System.out.printf("%-3s | %-6s | %-5s | %-15s | %-15s | %-12s| %-5s | %-5s%n", "STT", "Type", "ID", "Title", "Category", "Total", "Number", "Length");
		int i = 1;
		while(iterator.hasNext()) {
			Media media = iterator.next();
			if(media instanceof Book) {
				System.out.printf("%-3s | %-6s | %-5s | %-15s | %-15s | %-10s$ |%n", i, "Book", media.getId(), media.getTitle(), media.getCategory(), media.getCost());
			}else if(media instanceof DigitalVideoDisc) {
				System.out.printf("%-3s | %-6s | %-5s | %-15s | %-15s | %-10s$ |%n", i, "DVD", media.getId(), media.getTitle(), media.getCategory(), media.getCost());
			}else if(media instanceof CompactDisc) {
				System.out.printf("%-3s | %-6s | %-5s | %-15s | %-15s | %-10s$ | %-5s | %-5s%n", i, "CD", media.getId(), media.getTitle(), media.getCategory(), media.getCost(), ((CompactDisc)media).getTracks().size(), ((CompactDisc) media).getLength());
			}
			i++;
		}
		java.util.Collections.sort((List<Media>)collection);
		iterator = collection.iterator();
		System.out.println("-------------------------------------");
		System.out.println("The medias in sorted order are: ");
		System.out.printf("%-3s | %-6s | %-5s | %-15s | %-15s | %-12s| %-5s | %-5s%n", "STT", "Type", "ID", "Title", "Category", "Total", "Number", "Length");
		i = 1;
		while(iterator.hasNext()) {
			Media media = iterator.next();
			if(media instanceof Book) {
				System.out.printf("%-3s | %-6s | %-5s | %-15s | %-15s | %-10s$ |%n", i, "Book", media.getId(), media.getTitle(), media.getCategory(), media.getCost());
			}else if(media instanceof DigitalVideoDisc) {
				System.out.printf("%-3s | %-6s | %-5s | %-15s | %-15s | %-10s$ |%n", i, "DVD", media.getId(), media.getTitle(), media.getCategory(), media.getCost());
			}else if(media instanceof CompactDisc) {
				System.out.printf("%-3s | %-6s | %-5s | %-15s | %-15s | %-10s$ | %-5s | %-5s%n", i, "CD", media.getId(), media.getTitle(), media.getCategory(), media.getCost(), ((CompactDisc)media).getTracks().size(), ((CompactDisc) media).getLength());
			}
			i++;
		}
		System.out.println("--------------------------------------");
	}

}