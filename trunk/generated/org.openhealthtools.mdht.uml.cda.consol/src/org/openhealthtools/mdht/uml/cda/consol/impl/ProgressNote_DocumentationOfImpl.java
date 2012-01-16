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
import org.openhealthtools.mdht.uml.cda.consol.ProgressNote_DocumentationOf;

import org.openhealthtools.mdht.uml.cda.consol.operations.ProgressNote_DocumentationOfOperations;

import org.openhealthtools.mdht.uml.cda.impl.DocumentationOfImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Progress Note Documentation Of</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class ProgressNote_DocumentationOfImpl extends DocumentationOfImpl implements ProgressNote_DocumentationOf {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProgressNote_DocumentationOfImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.PROGRESS_NOTE_DOCUMENTATION_OF;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentationOfServiceEvent2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProgressNote_DocumentationOfOperations.validateDocumentationOfServiceEvent2(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProgressNote_DocumentationOf init() {
		CDAUtil.init(this);
		return this;
	}
} // ProgressNote_DocumentationOfImpl
