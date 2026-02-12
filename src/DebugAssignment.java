/* Hvis du kører programmet får du en række fejl.
 * Fix programmet så det kan køre
 * outputtet bliver:
 * "7 is the smallest!"
 *
 *  OBS! Skriv hvad du har gjort som kommentar ud for hver linje du fixer
 */
void main() {

    int a = 7, b = 42;

    minimum(a,b);
    // Removed logic from main and added it to function

}

void minimum(int a, int b) {

    // adding local variable smaller
    if (b > a) { // Replaced {} (curly brackets) with () (parenthesis) - proper logic (comparing b to a in size)

        System.out.println("a is the smallest!");

    } else {
        System.out.println("b is the smallest!");
    }

    // Method is now void, no need for return value

}
