print('Hello, World!')

import numpy as np

array = {1, 2, 3, 4}
for i in array:
    print('value: ' + i)

try: # exception handling example
    # ...some suspicious code...
    raise NameError('exception name') # raise the exception
except NameError as e: # handle the exception
    print('some error "' + e + '" was raised')

