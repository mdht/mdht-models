/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.HistoryAndPhysicalNote_ComponentOf;

import org.openhealthtools.mdht.uml.cda.consol.operations.HistoryAndPhysicalNote_ComponentOfOperations;

import org.openhealthtools.mdht.uml.cda.impl.Component1Impl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>History And Physical Note Component Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class HistoryAndPhysicalNote_ComponentOfImpl extends Component1Impl implements
		HistoryAndPhysicalNote_ComponentOf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryAndPhysicalNote_ComponentOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.HISTORY_AND_PHYSICAL_NOTE_COMPONENT_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentOfEncompassingEncounter(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return HistoryAndPhysicalNote_ComponentOfOperations.validateComponentOfEncompassingEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryAndPhysicalNote_ComponentOf init() {
    	CDAUtil.init(this);
    	return this;
	}
} // HistoryAndPhysicalNote_ComponentOfImpl
