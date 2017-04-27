/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;
import org.openhealthtools.mdht.uml.cda.emspcr.ProtocolAgeCategory;
import org.openhealthtools.mdht.uml.cda.emspcr.operations.ProtocolAgeCategoryOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Protocol Age Category</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class ProtocolAgeCategoryImpl extends org.eclipse.mdht.uml.cda.impl.ObservationImpl implements ProtocolAgeCategory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ProtocolAgeCategoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.PROTOCOL_AGE_CATEGORY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolAgeCategoryTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProtocolAgeCategoryOperations.validateProtocolAgeCategoryTemplateId(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolAgeCategoryMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProtocolAgeCategoryOperations.validateProtocolAgeCategoryMoodCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolAgeCategoryCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProtocolAgeCategoryOperations.validateProtocolAgeCategoryCodeP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolAgeCategoryCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProtocolAgeCategoryOperations.validateProtocolAgeCategoryCode(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolAgeCategoryValue(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProtocolAgeCategoryOperations.validateProtocolAgeCategoryValue(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateProtocolAgeCategoryValueP(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return ProtocolAgeCategoryOperations.validateProtocolAgeCategoryValueP(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProtocolAgeCategory init() {
	    return org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this);
	}

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public ProtocolAgeCategory init(Iterable<? extends org.eclipse.mdht.emf.runtime.util.Initializer<? extends EObject>> initializers) {
        org.eclipse.mdht.emf.runtime.util.Initializer.Util.init(this, initializers);
        return this;
    }
} // ProtocolAgeCategoryImpl
