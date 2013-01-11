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
import org.openhealthtools.mdht.uml.cda.emspcr.EMSProtocolSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSProtocolSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Protocol Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSProtocolSectionImpl extends SectionImpl implements EMSProtocolSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EMSProtocolSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return EmspcrPackage.Literals.EMS_PROTOCOL_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSProtocolSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSProtocolSectionOperations.validateEMSProtocolSectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSProtocolSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSProtocolSectionOperations.validateEMSProtocolSectionCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSProtocolSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSProtocolSectionOperations.validateEMSProtocolSectionTitle(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSProtocolSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSProtocolSectionOperations.validateEMSProtocolSectionText(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSProtocolSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSProtocolSectionOperations.validateEMSProtocolSectionEntry1(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSProtocolSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSProtocolSectionOperations.validateEMSProtocolSectionEntry3(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void getEntry1()
  {
    EMSProtocolSectionOperations.getEntry1(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void getEntry3s()
  {
    EMSProtocolSectionOperations.getEntry3s(this);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSProtocolSection init() {
    	CDAUtil.init(this);
    	return this;
  }
} // EMSProtocolSectionImpl
