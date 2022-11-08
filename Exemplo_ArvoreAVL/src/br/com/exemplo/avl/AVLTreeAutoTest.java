package br.com.exemplo.avl;

public class AVLTreeAutoTest extends AVLTreeTest {

	public AVLTreeAutoTest() {
		super();
	}

	public static void main(String[] args) throws NodeAlreadyExistsException {
		AVLTreeAutoTest test = new AVLTreeAutoTest();
		AVLTree tree = new AVLTree();

		int[] values = {10, 7, 13, 2, 5, 16, 3, 11, 6, 8, 12};

		// test insert()
		try {
			print(TESTING_INSERT, true);
			for (int i: values) {
				print(INSERTING + i + ELLIPSIS, false);
				tree.insert(i);
			}
		} catch (Exception e) {
			print(e.toString(), true);
		}

		// test find()
		try {
			print(TESTING_FIND, true);
			for (int i: values) {
				print(FINDING + i + ELLIPSIS, false);
				if (tree.find(i)) {
					print(SUCCESS, true);
				} else {
					print(FAILED, true);
				}
			}
		} catch (Exception e) {
			print(e.toString(), true);
		}
	}
}

