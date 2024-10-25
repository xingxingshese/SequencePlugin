package vanstudio.sequence.openapi;

import com.intellij.lang.LanguageExtension;
import com.intellij.psi.PsiElement;

public interface ElementTypeFinder {
    LanguageExtension<ElementTypeFinder> EP_NAME = new LanguageExtension<>("SequenceDiagramR.typeFinder");

    <T extends PsiElement> Class<T> findMethod();

    <T extends PsiElement> Class<T> findClass();
}
