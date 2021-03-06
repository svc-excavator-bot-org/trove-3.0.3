///////////////////////////////////////////////////////////////////////////////
// Copyright (c) 2008, Robert D. Eden All Rights Reserved.
// Copyright (c) 2009, Jeff Randall All Rights Reserved.
//
// This library is free software; you can redistribute it and/or
// modify it under the terms of the GNU Lesser General Public
// License as published by the Free Software Foundation; either
// version 2.1 of the License, or (at your option) any later version.
//
// This library is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.
//
// You should have received a copy of the GNU Lesser General Public
// License along with this program; if not, write to the Free Software
// Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA  02111-1307, USA.
///////////////////////////////////////////////////////////////////////////////

package gnu.trove.impl.unmodifiable;


//////////////////////////////////////////////////
// THIS IS A GENERATED CLASS. DO NOT HAND EDIT! //
//////////////////////////////////////////////////

////////////////////////////////////////////////////////////
// THIS IS AN IMPLEMENTATION CLASS. DO NOT USE DIRECTLY!  //
// Access to these methods should be through TCollections //
////////////////////////////////////////////////////////////


import gnu.trove.iterator.*;
import gnu.trove.procedure.*;
import gnu.trove.set.*;
import gnu.trove.list.*;
import gnu.trove.function.*;
import gnu.trove.map.*;
import gnu.trove.*;

import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import java.util.Map;
import java.util.RandomAccess;
import java.util.Random;
import java.io.Serializable;
import java.io.ObjectOutputStream;
import java.io.IOException;


public class TUnmodifiableDoubleDoubleMap implements TDoubleDoubleMap, Serializable {
	private static final long serialVersionUID = -1034234728574286014L;

	private final TDoubleDoubleMap m;

	public TUnmodifiableDoubleDoubleMap( TDoubleDoubleMap m ) {
		if ( m == null )
			throw new NullPointerException();
		this.m = m;
	}

    @Override
	public int size()                       { return m.size(); }
    @Override
	public boolean isEmpty()                { return m.isEmpty(); }
    @Override
	public boolean containsKey( double key )   { return m.containsKey( key ); }
    @Override
	public boolean containsValue( double val ) { return m.containsValue( val ); }
    @Override
	public double get( double key)                { return m.get( key ); }

    @Override
	public double put( double key, double value ) { throw new UnsupportedOperationException(); }
    @Override
	public double remove( double key ) { throw new UnsupportedOperationException(); }
    @Override
	public void putAll( TDoubleDoubleMap m ) { throw new UnsupportedOperationException(); }
    @Override
	public void putAll( Map<? extends Double, ? extends Double> map ) { throw new UnsupportedOperationException(); }
    @Override
	public void clear() { throw new UnsupportedOperationException(); }

	private transient TDoubleSet keySet = null;
	private transient TDoubleCollection values = null;

    @Override
	public TDoubleSet keySet() {
		if ( keySet == null )
			keySet = TCollections.unmodifiableSet( m.keySet() );
		return keySet;
	}
    @Override
	public double[] keys() { return m.keys(); }
    @Override
	public double[] keys( double[] array ) { return m.keys( array ); }

    @Override
	public TDoubleCollection valueCollection() {
		if ( values == null )
			values = TCollections.unmodifiableCollection( m.valueCollection() );
		return values;
	}
    @Override
	public double[] values() { return m.values(); }
    @Override
	public double[] values( double[] array ) { return m.values( array ); }

    @Override
	public boolean equals(Object o) { return o == this || m.equals(o); }
    @Override
	public int hashCode()           { return m.hashCode(); }
    @Override
	public String toString()        { return m.toString(); }
    @Override
	public double getNoEntryKey()      { return m.getNoEntryKey(); }
    @Override
	public double getNoEntryValue()    { return m.getNoEntryValue(); }

    @Override
	public boolean forEachKey( TDoubleProcedure procedure ) {
		return m.forEachKey( procedure );
	}
    @Override
	public boolean forEachValue( TDoubleProcedure procedure ) {
		return m.forEachValue( procedure );
	}
    @Override
	public boolean forEachEntry( TDoubleDoubleProcedure procedure ) {
		return m.forEachEntry( procedure );
	}

    @Override
	public TDoubleDoubleIterator iterator() {
		return new TDoubleDoubleIterator() {
			TDoubleDoubleIterator iter = m.iterator();

            @Override
			public double key() { return iter.key(); }
            @Override
			public double value() { return iter.value(); }
            @Override
			public void advance() { iter.advance(); }
            @Override
			public boolean hasNext() { return iter.hasNext(); }
            @Override
			public double setValue( double val ) { throw new UnsupportedOperationException(); }
            @Override
			public void remove() { throw new UnsupportedOperationException(); }
		};
	}

    @Override
	public double putIfAbsent( double key, double value ) { throw new UnsupportedOperationException(); }
    @Override
	public void transformValues( TDoubleFunction function ) { throw new UnsupportedOperationException(); }
    @Override
	public boolean retainEntries( TDoubleDoubleProcedure procedure ) { throw new UnsupportedOperationException(); }
    @Override
	public boolean increment( double key ) { throw new UnsupportedOperationException(); }
    @Override
	public boolean adjustValue( double key, double amount ) { throw new UnsupportedOperationException(); }
    @Override
	public double adjustOrPutValue( double key, double adjust_amount, double put_amount ) { throw new UnsupportedOperationException(); }
}
