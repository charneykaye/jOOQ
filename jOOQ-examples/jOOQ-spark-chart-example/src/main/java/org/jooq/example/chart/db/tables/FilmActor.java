/**
 * This class is generated by jOOQ
 */
package org.jooq.example.chart.db.tables;


import java.sql.Timestamp;
import java.util.Arrays;
import java.util.List;

import javax.annotation.Generated;

import org.jooq.Field;
import org.jooq.ForeignKey;
import org.jooq.Schema;
import org.jooq.Table;
import org.jooq.TableField;
import org.jooq.UniqueKey;
import org.jooq.example.chart.db.Keys;
import org.jooq.example.chart.db.Public;
import org.jooq.example.chart.db.tables.records.FilmActorRecord;
import org.jooq.impl.TableImpl;


/**
 * This class is generated by jOOQ.
 */
@Generated(
    value = {
        "http://www.jooq.org",
        "jOOQ version:3.8.0",
        "schema version:public_2",
    },
    date = "2016-06-30T15:44:15.143Z",
    comments = "This class is generated by jOOQ"
)
@SuppressWarnings({ "all", "unchecked", "rawtypes" })
public class FilmActor extends TableImpl<FilmActorRecord> {

    private static final long serialVersionUID = -1221545848;

    /**
     * The reference instance of <code>public.film_actor</code>
     */
    public static final FilmActor FILM_ACTOR = new FilmActor();

    /**
     * The class holding records for this type
     */
    @Override
    public Class<FilmActorRecord> getRecordType() {
        return FilmActorRecord.class;
    }

    /**
     * The column <code>public.film_actor.actor_id</code>.
     */
    public final TableField<FilmActorRecord, Integer> ACTOR_ID = createField("actor_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.film_actor.film_id</code>.
     */
    public final TableField<FilmActorRecord, Integer> FILM_ID = createField("film_id", org.jooq.impl.SQLDataType.INTEGER.nullable(false), this, "");

    /**
     * The column <code>public.film_actor.last_update</code>.
     */
    public final TableField<FilmActorRecord, Timestamp> LAST_UPDATE = createField("last_update", org.jooq.impl.SQLDataType.TIMESTAMP.nullable(false).defaultValue(org.jooq.impl.DSL.field("now()", org.jooq.impl.SQLDataType.TIMESTAMP)), this, "");

    /**
     * Create a <code>public.film_actor</code> table reference
     */
    public FilmActor() {
        this("film_actor", null);
    }

    /**
     * Create an aliased <code>public.film_actor</code> table reference
     */
    public FilmActor(String alias) {
        this(alias, FILM_ACTOR);
    }

    private FilmActor(String alias, Table<FilmActorRecord> aliased) {
        this(alias, aliased, null);
    }

    private FilmActor(String alias, Table<FilmActorRecord> aliased, Field<?>[] parameters) {
        super(alias, null, aliased, parameters, "");
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public Schema getSchema() {
        return Public.PUBLIC;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public UniqueKey<FilmActorRecord> getPrimaryKey() {
        return Keys.FILM_ACTOR_PKEY;
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<UniqueKey<FilmActorRecord>> getKeys() {
        return Arrays.<UniqueKey<FilmActorRecord>>asList(Keys.FILM_ACTOR_PKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public List<ForeignKey<FilmActorRecord, ?>> getReferences() {
        return Arrays.<ForeignKey<FilmActorRecord, ?>>asList(Keys.FILM_ACTOR__FILM_ACTOR_ACTOR_ID_FKEY, Keys.FILM_ACTOR__FILM_ACTOR_FILM_ID_FKEY);
    }

    /**
     * {@inheritDoc}
     */
    @Override
    public FilmActor as(String alias) {
        return new FilmActor(alias, this);
    }

    /**
     * Rename this table
     */
    public FilmActor rename(String name) {
        return new FilmActor(name, null);
    }
}