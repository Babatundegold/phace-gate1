import unittest
import task1

class TestCalculate_years(unittest.TestCase):

    def test_when_father_is_currently_the_multiple(self):
        self.assertEqual(calculate_years_ago(36, 6, 6), 0)

    def test_when_it_was_in_the_past(self):
        self.assertEqual(calculate_years_ago(30, 5, 4), -3)

    def test_when_it_will_be_in_the_future(self):
        self.assertEqual(calculate_years_ago(30, 10, 2), -10)

    def test_edge_cases(self):
        self.assertEqual(calculate_years_ago(25, 30, 2), None)
      
        self.assertEqual(calculate_years_ago(30, 30, 2), None)
       
if __name__ == '__main__':
    unittest.main()






		

