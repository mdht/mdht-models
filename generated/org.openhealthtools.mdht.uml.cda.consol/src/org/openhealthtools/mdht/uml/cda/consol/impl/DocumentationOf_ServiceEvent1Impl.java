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
import org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent1;

import org.openhealthtools.mdht.uml.cda.consol.operations.DocumentationOf_ServiceEvent1Operations;

import org.openhealthtools.mdht.uml.cda.impl.ServiceEventImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation Of Service Event1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DocumentationOf_ServiceEvent1Impl extends ServiceEventImpl implements DocumentationOf_ServiceEvent1 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationOf_ServiceEvent1Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent1ProcedureCodes(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent1Operations.validateServiceEvent1ProcedureCodes(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent1EffectiveTimeHasLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent1Operations.validateServiceEvent1EffectiveTimeHasLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent1EffectiveTimeHasHighWhenNoWidth(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent1Operations.validateServiceEvent1EffectiveTimeHasHighWhenNoWidth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent1EffectiveTimeNoHighIfWidth(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent1Operations.validateServiceEvent1EffectiveTimeNoHighIfWidth(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent1AnyAssistantsAsSecondary(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent1Operations.validateServiceEvent1AnyAssistantsAsSecondary(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent1Code(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent1Operations.validateServiceEvent1Code(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent1EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent1Operations.validateServiceEvent1EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationOf_ServiceEvent1 init() {
    	CDAUtil.init(this);
    	return this;
	}
} // DocumentationOf_ServiceEvent1Impl
