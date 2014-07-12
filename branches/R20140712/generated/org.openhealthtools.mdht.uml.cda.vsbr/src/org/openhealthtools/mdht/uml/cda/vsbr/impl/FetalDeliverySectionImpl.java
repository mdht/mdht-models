/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.impl;

import java.lang.Iterable;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.emf.runtime.util.Initializer;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder;
import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive;
import org.openhealthtools.mdht.uml.cda.vsbr.Plurality;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.operations.FetalDeliverySectionOperations;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Fetal Delivery Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class FetalDeliverySectionImpl extends SectionImpl implements FetalDeliverySection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected FetalDeliverySectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return VsbrPackage.Literals.FETAL_DELIVERY_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionText(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionText(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionBirthOrder(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionBirthOrder(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeliverySectionNumberOfInfantsBornAlive(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionNumberOfInfantsBornAlive(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionAutopsyPerformance(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionAutopsyPerformance(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionFetalDeathOccurrance(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeathOccurrance(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionPlurality(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionPlurality(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateFetalDeliverySectionCongenitalAnomaly(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionCongenitalAnomaly(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionFetalDeliveryTime(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliveryTime(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionFetalDeliverySubject(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubject(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP(
			DiagnosticChain diagnostics, Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionFetalDeliverySubjectTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectTypeCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus(DiagnosticChain diagnostics,
			Map<Object, Object> context) {
    return FetalDeliverySectionOperations.validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public BirthOrder getBirthOrder() {
    return FetalDeliverySectionOperations.getBirthOrder(this);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public NumberofInfantsBornAlive getNumberOfInfantsBornAlive()
  {
    return FetalDeliverySectionOperations.getNumberOfInfantsBornAlive(this);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public AutopsyPerformance getAutopsyPerformance() {
    return FetalDeliverySectionOperations.getAutopsyPerformance(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FetalDeathOccurrance getFetalDeathOccurrance() {
    return FetalDeliverySectionOperations.getFetalDeathOccurrance(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public Plurality getPlurality() {
    return FetalDeliverySectionOperations.getPlurality(this);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<CongenitalAnomaly> getCongenitalAnomalies()
  {
    return FetalDeliverySectionOperations.getCongenitalAnomalies(this);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FetalDeliveryTime getFetalDeliveryTime() {
    return FetalDeliverySectionOperations.getFetalDeliveryTime(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public FetalDeliverySection init() {
      return Initializer.Util.init(this);
  }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public FetalDeliverySection init(Iterable<? extends Initializer<? extends EObject>> initializers) {
        Initializer.Util.init(this, initializers);
        return this;
    }
} // FetalDeliverySectionImpl
