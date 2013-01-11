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

import org.openhealthtools.mdht.uml.cda.Observation;
import org.eclipse.emf.ecore.EObject;
import org.openhealthtools.mdht.emf.runtime.util.Initializer;
import org.openhealthtools.mdht.uml.cda.emspcr.EMSDispositionSection;
import org.openhealthtools.mdht.uml.cda.emspcr.EmspcrPackage;

import org.openhealthtools.mdht.uml.cda.emspcr.operations.EMSDispositionSectionOperations;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;
import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>EMS Disposition Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class EMSDispositionSectionImpl extends SectionImpl implements EMSDispositionSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected EMSDispositionSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return EmspcrPackage.Literals.EMS_DISPOSITION_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSDispositionSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSDispositionSectionOperations.validateEMSDispositionSectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSDispositionSectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSDispositionSectionOperations.validateEMSDispositionSectionCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSDispositionSectionCodeP(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSDispositionSectionOperations.validateEMSDispositionSectionCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSDispositionSectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSDispositionSectionOperations.validateEMSDispositionSectionText(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSDispositionSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSDispositionSectionOperations.validateEMSDispositionSectionTitle(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSDispositionSectionEntry1(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry1(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSDispositionSectionEntry2(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry2(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSDispositionSectionEntry3(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry3(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSDispositionSectionEntry5(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry5(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSDispositionSectionEntry7(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry7(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSDispositionSectionEntry6(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry6(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateEMSDispositionSectionEntry4(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return EMSDispositionSectionOperations.validateEMSDispositionSectionEntry4(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void getEntry1()
  {
    EMSDispositionSectionOperations.getEntry1(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void getEntry2()
  {
    EMSDispositionSectionOperations.getEntry2(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void getEntry3()
  {
    EMSDispositionSectionOperations.getEntry3(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void getEntry5()
  {
    EMSDispositionSectionOperations.getEntry5(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void getEntry7()
  {
    EMSDispositionSectionOperations.getEntry7(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void getEntry6()
  {
    EMSDispositionSectionOperations.getEntry6(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Observation getemspcrEntry4()
  {
    return EMSDispositionSectionOperations.getemspcrEntry4(this);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EMSDispositionSection init() {
    	CDAUtil.init(this);
    	return this;
  }
} // EMSDispositionSectionImpl
