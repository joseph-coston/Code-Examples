#include <iostream>

using namespace std;
int main()
{
    cout << "Hello, World!";
}

void exception_example()
{
    try /* exception handling example */
    {
        /* ...some suspicious code... */
        throw 1; /* throw an exception */
    }
    catch (int e) /* handler function catches the exception */
    {
        cout << "Exception #" << e << 'thrown\n'; /* prints an error */
    }
    return 0;
}
