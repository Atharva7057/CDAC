#include <iostream>
#include <string.h>
using namespace std;

class TollBooth {
private:
    int total_vehicles;
    double revenue;

public:
    // Constructor to initialize variables
    TollBooth() : total_vehicles(0), revenue(0.0) {}

    double getRevenue() const {
        return revenue;
    }

    void setRevenue(double revenue) {
        this->revenue = revenue;
    }

    int getTotalVehicles() const {
        return total_vehicles;
    }

    void setTotalVehicles(int totalVehicles) {
        this->total_vehicles = totalVehicles;
    }

    void reset() {
        setRevenue(0);
        setTotalVehicles(0);
    }

    void payTollForCar(double amt) {
        revenue += amt;        // Add amount to revenue
//        total_vehicles++;
        cout<<"pay called";// Increment the total vehicles
    }
};

int main() {
    int choice = 0;
    TollBooth t;
    do {
        cout << "------------------------------------------------------------" << endl;
        cout << "1. Add a standard car and collect toll  " << endl;
        cout << "2. Add a truck and collect toll " << endl;
        cout << "3. Add a bus and collect toll  " << endl;
        cout << "4. Display total cars passed " << endl;
        cout << "5. Display total revenue collected  " << endl;
        cout << "6. Reset booth statistics  " << endl;
        cout << "7. Exit " << endl;
        cout << "Enter your choice: ";
        cin >> choice;

        switch (choice) {
            case 1: {
                int amt;
                cout << "Toll Amount: ";
                cin >> amt;
                t.payTollForCar(amt);
                int v = t.getTotalVehicles()+1;
                t.setTotalVehicles(v);
                break;
            }
            case 2: {
                int amt;
                cout << "Toll Amount: ";
                cin >> amt;
                t.payTollForCar(amt); // Calls the same method
                int v = t.getTotalVehicles()+1;
                                t.setTotalVehicles(v);
                break;
            }
            case 3: {
                int amt;
                cout << "Toll Amount: ";
                cin >> amt;
                t.payTollForCar(amt); // Calls the same method
                int v = t.getTotalVehicles()+1;
                                t.setTotalVehicles(v);
                break;
            }
            case 4:
                cout << "Total cars Passed: " << t.getTotalVehicles() << endl;
                break;
            case 5:
                cout << "Total Revenue: " << t.getRevenue() << endl;
                break;
            case 6:
                t.reset();
                cout << "Data Reset successful!" << endl;
                break;
            case 7:
                cout << "Exiting" << endl;
                break;
            default:
                cout << "Invalid Input..." << endl;
        }
    } while (choice != 7);

    return 0;
}
