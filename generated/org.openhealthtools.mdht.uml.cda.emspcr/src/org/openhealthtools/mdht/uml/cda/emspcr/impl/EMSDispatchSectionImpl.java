/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.emspcr.impl;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispatchSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSDispatchSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Dispatch Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSDispatchSectionImpl extends SectionImpl implements EMSDispatchSection {
	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	protected EMSDispatchSectionImpl() {
		super();
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	@Override
	protected EClass eStaticClass() {
		return EmspcrPackage.Literals.EMS_DISPATCH_SECTION;
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSDispatchSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispatchSectionOperations.validateEMSDispatchSectionTemplateId(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSDispatchSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispatchSectionOperations.validateEMSDispatchSectionCode(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSDispatchSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispatchSectionOperations.validateEMSDispatchSectionText(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSDispatchSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispatchSectionOperations.validateEMSDispatchSectionTitle(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSDispatchSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispatchSectionOperations.validateEMSDispatchSectionEntry1(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public boolean validateEMSDispatchSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return EMSDispatchSectionOperations.validateEMSDispatchSectionEntry2(this, diagnostics, context);
	}

	/**
	* <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	* @generated
	*/
	public EMSDispatchSection init() {
		return Initializer.Util.init(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EMSDispatchSection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
		Initializer.Util.init(this, initializers);
		return this;
	}
} // EMSDispatchSectionImpl
