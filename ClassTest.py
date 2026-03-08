class Car:
    def __init__(self, brand,model):
        self.brand =brand
        self.model =model
    def drive(self):
        print(f"{self.brand} {self.model} is driving")

car1 =Car("Tesla","Model 5")
car1.drive()