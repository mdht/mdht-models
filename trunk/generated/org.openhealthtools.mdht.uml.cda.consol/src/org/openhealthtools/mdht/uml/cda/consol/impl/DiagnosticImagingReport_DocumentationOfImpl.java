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
import org.openhealthtools.mdht.uml.cda.consol.DiagnosticImagingReport_DocumentationOf;

import org.openhealthtools.mdht.uml.cda.consol.operations.DiagnosticImagingReport_DocumentationOfOperations;

import org.openhealthtools.mdht.uml.cda.impl.DocumentationOfImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Diagnostic Imaging Report Documentation Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DiagnosticImagingReport_DocumentationOfImpl extends DocumentationOfImpl implements
		DiagnosticImagingReport_DocumentationOf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DiagnosticImagingReport_DocumentationOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DIAGNOSTIC_IMAGING_REPORT_DOCUMENTATION_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentationOfServiceEvent3(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DiagnosticImagingReport_DocumentationOfOperations.validateDocumentationOfServiceEvent3(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosticImagingReport_DocumentationOf init() {
    	CDAUtil.init(this);
    	return this;
	}
} // DiagnosticImagingReport_DocumentationOfImpl
