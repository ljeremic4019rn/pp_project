main () {
    char a,b;
    a = 'a';
    b = 3 + 4 + 5;

    case a of
    'a': write("hit");
    ;
    'b': {
        int b;
        b = 3;
        a = 'b';
        write("error");
    }
    ;
    'c': read(b);
    end
}