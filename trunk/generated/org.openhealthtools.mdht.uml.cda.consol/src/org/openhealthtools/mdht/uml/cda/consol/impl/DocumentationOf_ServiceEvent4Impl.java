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
import org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent4;

import org.openhealthtools.mdht.uml.cda.consol.operations.DocumentationOf_ServiceEvent4Operations;

import org.openhealthtools.mdht.uml.cda.impl.ServiceEventImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation Of Service Event4</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DocumentationOf_ServiceEvent4Impl extends ServiceEventImpl implements DocumentationOf_ServiceEvent4 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationOf_ServiceEvent4Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT4;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent4ClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent4Operations.validateServiceEvent4ClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent4Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent4Operations.validateServiceEvent4Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent4Id(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent4Operations.validateServiceEvent4Id(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent4PhysicianReadingStudyPerformer(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent4Operations.validateServiceEvent4PhysicianReadingStudyPerformer(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationOf_ServiceEvent4 init() {
		CDAUtil.init(this);
		return this;
	}
} // DocumentationOf_ServiceEvent4Impl
