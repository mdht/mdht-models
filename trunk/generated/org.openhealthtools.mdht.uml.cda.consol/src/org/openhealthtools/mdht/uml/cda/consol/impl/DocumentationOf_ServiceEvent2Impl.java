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
import org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent2;

import org.openhealthtools.mdht.uml.cda.consol.operations.DocumentationOf_ServiceEvent2Operations;

import org.openhealthtools.mdht.uml.cda.impl.ServiceEventImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation Of Service Event2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DocumentationOf_ServiceEvent2Impl extends ServiceEventImpl implements DocumentationOf_ServiceEvent2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationOf_ServiceEvent2Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent2ClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent2Operations.validateServiceEvent2ClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent2EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent2Operations.validateServiceEvent2EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationOf_ServiceEvent2 init() {
    	CDAUtil.init(this);
    	return this;
	}
} // DocumentationOf_ServiceEvent2Impl
