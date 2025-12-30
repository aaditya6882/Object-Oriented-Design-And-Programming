package Week6.test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import Workshop6.LibraryService;

public class TestLibraryService {
	private LibraryService library;

	@BeforeAll
	static void setupAll() {
		System.out.println("Starting LibraryService tests...");
	}

	@AfterAll
	static void tearDownAll() {
		System.out.println("All LibraryService tests completed.");
	}

	@BeforeEach
	void setup() {
		library = new LibraryService();
		System.out.println("LibraryService initialized.");
	}

	@AfterEach
	void tearDown() {
		library.clearLibrary();
		System.out.println("LibraryService cleaned up.");
	}

	@Test
	void testAddBook() {
		library.addBook("Java Programming");
		assertTrue(library.searchBook("Java Programming"));
	}

	@Test
	void testSearchBookFound() {
		library.addBook("Python Programming");
		assertTrue(library.searchBook("Python Programming"));
	}

	@Test
	void testSearchBookNotFound() {
		library.addBook("C++ Programming");
		assertFalse(library.searchBook("JavaScript"));
	}
}
