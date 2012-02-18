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
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_ComponentOf;

import org.openhealthtools.mdht.uml.cda.consol.operations.DiagnosticImagingReport_ComponentOfOperations;

import org.openhealthtools.mdht.uml.cda.impl.Component1Impl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Imaging Report Component Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DiagnosticImagingReport_ComponentOfImpl extends Component1Impl implements
		DiagnosticImagingReport_ComponentOf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticImagingReport_ComponentOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT_COMPONENT_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateComponentOfEncompassingEncounter(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport_ComponentOfOperations.validateComponentOfEncompassingEncounter(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticImagingReport_ComponentOf init() {
    	CDAUtil.init(this);
    	return this;
	}
} // DiagnosticImagingReport_ComponentOfImpl
