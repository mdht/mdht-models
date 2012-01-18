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
import org.openhealthtools.mdht.uml.cda.consol.DocumentationOf_ServiceEvent3;

import org.openhealthtools.mdht.uml.cda.consol.operations.DocumentationOf_ServiceEvent3Operations;

import org.openhealthtools.mdht.uml.cda.impl.ServiceEventImpl;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Documentation Of Service Event3</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class DocumentationOf_ServiceEvent3Impl extends ServiceEventImpl implements DocumentationOf_ServiceEvent3 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DocumentationOf_ServiceEvent3Impl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ConsolPackage.Literals.DOCUMENTATION_OF_SERVICE_EVENT3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent3EffectiveTimeLow(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent3Operations.validateServiceEvent3EffectiveTimeLow(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent3EffectiveTimeHigh(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent3Operations.validateServiceEvent3EffectiveTimeHigh(
			this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent3ClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent3Operations.validateServiceEvent3ClassCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent3EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent3Operations.validateServiceEvent3EffectiveTime(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateServiceEvent3Performer(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return DocumentationOf_ServiceEvent3Operations.validateServiceEvent3Performer(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentationOf_ServiceEvent3 init() {
		CDAUtil.init(this);
		return this;
	}
} // DocumentationOf_ServiceEvent3Impl
