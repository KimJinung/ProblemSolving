primes = set()


def is_prime(num: int) -> bool:
    if num < 2: return False

    for i in range(2, int(num ** 1/2) + 1):
        if num % i == 0:
            return False

    return True


def recursive(acc: str, num_list: list, is_used: list) -> None:
    for i in range(len(num_list)):
        if is_used[i]: continue

        next_acc = acc + num_list[i]
        num = int(next_acc)
        if is_prime(num):
            global primes
            primes.add(num)

        is_used[i] = True
        recursive(next_acc, num_list, is_used)
        is_used[i] = False


def solution(numbers):
    num_list = list(numbers)
    is_used = [False for _ in range(len(numbers))]
    recursive("", num_list, is_used)

    return len(primes)