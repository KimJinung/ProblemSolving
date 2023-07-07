AMERICANO = 5500;

def solution(money):
    couple_of_coffee = money // AMERICANO
    remaining_money = money - couple_of_coffee * AMERICANO
    return [couple_of_coffee, remaining_money]