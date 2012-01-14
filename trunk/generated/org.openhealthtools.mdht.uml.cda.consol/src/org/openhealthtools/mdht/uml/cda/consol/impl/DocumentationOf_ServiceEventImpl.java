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
import org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent;

import org.openhealthtools.mdht.uml.cda.consol.operations.DocumentationOf_ServiceEventOperations;

import org.openhealthtools.mdht.uml.cda.impl.ServiceEventImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation Of Service Event</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DocumentationOf_ServiceEventImpl extends ServiceEventImpl implements DocumentationOf_ServiceEvent {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationOf_ServiceEventImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEventProcedureCodes(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEventOperations.validateServiceEventProcedureCodes(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEventEffectiveTimeHasLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEventOperations.validateServiceEventEffectiveTimeHasLow(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEventEffectiveTimeHasHighWhenNoWidth(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DocumentationOf_ServiceEventOperations.validateServiceEventEffectiveTimeHasHighWhenNoWidth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEventEffectiveTimeNoHighIfWidth(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
		return DocumentationOf_ServiceEventOperations.validateServiceEventEffectiveTimeNoHighIfWidth(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEventAnyAssistantsAsSecondary(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEventOperations.validateServiceEventAnyAssistantsAsSecondary(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEventCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEventOperations.validateServiceEventCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEventEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEventOperations.validateServiceEventEffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationOf_ServiceEvent init() {
		CDAUtil.init(this);
		return this;
	}
} // DocumentationOf_ServiceEventImpl
