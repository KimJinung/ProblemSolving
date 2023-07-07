LAMB = 12000
BEVERAGE = 2000

def solution(n, k):
    service_count = n // 10
    k -= service_count
    return (LAMB * n) + (BEVERAGE * k)