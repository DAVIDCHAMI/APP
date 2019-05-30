package co.com.bancolombia.models;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;

/**
 * The type Category model.
 */
public class Category {
    private String title;

    /**
     * Instantiates a new Category model.
     *
     * @param title the title
     */
    public Category(String title) {
        this.title = title;
    }

    /**
     * Instantiates a new Category model.
     */
    public Category() {

    }

    /**
     * Gets title.
     *
     * @return the title
     */
    public String getTitle() {
        return title;
    }

    /**
     * Sets title.
     *
     * @param title the title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }

        if (o == null || getClass() != o.getClass()) {
            return false;
        }

        Category category = (Category) o;

        return new EqualsBuilder()
                .append(title, category.title)
                .isEquals();
    }

    @Override
    public int hashCode() {
        return new HashCodeBuilder(17, 37)
                .append(title)
                .toHashCode();
    }
}
