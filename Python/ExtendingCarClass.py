class Car:
    def __init__(self, brand,model):
        self.brand =brand
        self.model =model

    def drive(self):
        print(f" {self.brand} {self.model} is running")

# Subclass

class ElectricCar(Car):
    def __init__(self, brand,model, battery_capacity):
        super().__init__(brand,model)

        self.battery_capacity = battery_capacity

    def charge(self):
        print(f" {self.brand} and {self.model} is charging with {self.battery_capacity}" )

tesla = ElectricCar("Tesla", "model 2",45)
tesla.drive()
tesla.charge()