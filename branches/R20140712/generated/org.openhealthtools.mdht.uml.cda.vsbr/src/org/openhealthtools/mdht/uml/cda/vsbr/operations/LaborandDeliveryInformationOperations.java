/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.vsbr.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.operations.ClinicalStatementOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.CharacteristicofLaborandDelivery;
import org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation;
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalMorbidity;
import org.openhealthtools.mdht.uml.cda.vsbr.MaternalTransfer;
import org.openhealthtools.mdht.uml.cda.vsbr.PlannedHomeBirth;
import org.openhealthtools.mdht.uml.cda.vsbr.PregnancyRiskFactor;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Laborand Delivery Information</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationAttendantParticipation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attendant Participation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Characteristicsof Laborand Delivery</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationHomeBirthPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Home Birth Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationMaternalTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Maternal Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationParticipatingLocation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Participating Location</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationMaternalMorbidities(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Maternal Morbidities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#validateLaborandDeliveryInformationRiskFactors(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Risk Factors</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getCharacteristicsofLaborandDeliveries() <em>Get Characteristicsof Laborand Deliveries</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getHomeBirthPlan() <em>Get Home Birth Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getMaternalTransfer() <em>Get Maternal Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getMaternalMorbiditiess() <em>Get Maternal Morbiditiess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.LaborandDeliveryInformation#getRiskFactorss() <em>Get Risk Factorss</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LaborandDeliveryInformationOperations extends ClinicalStatementOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected LaborandDeliveryInformationOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationTemplateId(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationTemplateId(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.31')";

	/**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationTemplateId(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationTemplateId(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLaborandDeliveryInformationTemplateId(
			LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationClassCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationClassCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.classCode=vocab::x_ActClassDocumentEntryAct::ACT";

	/**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationClassCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationClassCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLaborandDeliveryInformationClassCode(
			LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_CLASS_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationClassCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationMoodCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationMoodCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.moodCode=vocab::x_DocumentActMood::EVN";

	/**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationMoodCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationMoodCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLaborandDeliveryInformationMoodCode(
			LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_MOOD_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationMoodCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationCodeP(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationCodeP(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationCodeP(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationCodeP(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLaborandDeliveryInformationCodeP(
			LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_CODE_P,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationCodeP", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.code = '57074-7' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationCode(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLaborandDeliveryInformationCode(
			LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_CODE,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationCode", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationAttendantParticipation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attendant Participation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationAttendantParticipation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.performer->one(performer : cda::Performer2 | not performer.oclIsUndefined() and performer.oclIsKindOf(cda::Performer2))";

	/**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationAttendantParticipation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Attendant Participation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationAttendantParticipation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLaborandDeliveryInformationAttendantParticipation(
			LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_ATTENDANT_PARTICIPATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationAttendantParticipation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationEntryRelationship(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Entry Relationship</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationEntryRelationship(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationEntryRelationship(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Entry Relationship</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationEntryRelationship(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLaborandDeliveryInformationEntryRelationship(
			LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_ENTRY_RELATIONSHIP,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationEntryRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Characteristicsof Laborand Delivery</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Characteristic of Labor and Delivery) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Characteristicsof Laborand Delivery</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLaborandDeliveryInformationCharacteristicsofLaborandDelivery(
			LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_CHARACTERISTICSOF_LABORAND_DELIVERY,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationCharacteristicsofLaborandDelivery", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationHomeBirthPlan(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Home Birth Plan</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationHomeBirthPlan(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Planned Home Birth) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationHomeBirthPlan(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Home Birth Plan</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationHomeBirthPlan(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLaborandDeliveryInformationHomeBirthPlan(
			LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_HOME_BIRTH_PLAN,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationHomeBirthPlan", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationMaternalTransfer(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Maternal Transfer</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationMaternalTransfer(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Maternal Transfer) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationMaternalTransfer(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Maternal Transfer</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationMaternalTransfer(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLaborandDeliveryInformationMaternalTransfer(
			LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_MATERNAL_TRANSFER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationMaternalTransfer", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationParticipatingLocation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Participating Location</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationParticipatingLocation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->one(participant : cda::Participant2 | not participant.oclIsUndefined() and participant.oclIsKindOf(cda::Participant2))";

	/**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationParticipatingLocation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Participating Location</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationParticipatingLocation(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLaborandDeliveryInformationParticipatingLocation(
			LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_PARTICIPATING_LOCATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_PARTICIPATING_LOCATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationParticipatingLocation", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationMaternalMorbidities(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Maternal Morbidities</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationMaternalMorbidities(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Maternal Morbidity) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationMaternalMorbidities(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Maternal Morbidities</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationMaternalMorbidities(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLaborandDeliveryInformationMaternalMorbidities(
			LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_MATERNAL_MORBIDITIES,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationMaternalMorbidities", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateLaborandDeliveryInformationRiskFactors(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Risk Factors</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationRiskFactors(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_LABORAND_DELIVERY_INFORMATION_RISK_FACTORS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(vsbr::Pregnancy Risk Factor) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::COMP)";

	/**
   * The cached OCL invariant for the '{@link #validateLaborandDeliveryInformationRiskFactors(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Laborand Delivery Information Risk Factors</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateLaborandDeliveryInformationRiskFactors(LaborandDeliveryInformation, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */

	protected static Constraint VALIDATE_LABORAND_DELIVERY_INFORMATION_RISK_FACTORS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * @param laborandDeliveryInformation The receiving '<em><b>Laborand Delivery Information</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */

	public static boolean validateLaborandDeliveryInformationRiskFactors(
			LaborandDeliveryInformation laborandDeliveryInformation, DiagnosticChain diagnostics,
			Map<Object, Object> context) {
  	  
    if (VALIDATE_LABORAND_DELIVERY_INFORMATION_RISK_FACTORS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION);
      try
      {
        VALIDATE_LABORAND_DELIVERY_INFORMATION_RISK_FACTORS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_LABORAND_DELIVERY_INFORMATION_RISK_FACTORS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_LABORAND_DELIVERY_INFORMATION_RISK_FACTORS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(laborandDeliveryInformation))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             VsbrValidator.DIAGNOSTIC_SOURCE,
             VsbrValidator.LABORAND_DELIVERY_INFORMATION__LABORAND_DELIVERY_INFORMATION_RISK_FACTORS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "LaborandDeliveryInformationRiskFactors", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(laborandDeliveryInformation, context) }),
             new Object [] { laborandDeliveryInformation }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getCharacteristicsofLaborandDeliveries(LaborandDeliveryInformation) <em>Get Characteristicsof Laborand Deliveries</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCharacteristicsofLaborandDeliveries(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
	protected static final String GET_CHARACTERISTICSOF_LABORAND_DELIVERIES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Characteristic of Labor and Delivery)).oclAsType(vsbr::Characteristic of Labor and Delivery)";

	/**
   * The cached OCL query for the '{@link #getCharacteristicsofLaborandDeliveries(LaborandDeliveryInformation) <em>Get Characteristicsof Laborand Deliveries</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getCharacteristicsofLaborandDeliveries(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_CHARACTERISTICSOF_LABORAND_DELIVERIES__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */

	public static EList<CharacteristicofLaborandDelivery> getCharacteristicsofLaborandDeliveries(
			LaborandDeliveryInformation laborandDeliveryInformation) {
    if (GET_CHARACTERISTICSOF_LABORAND_DELIVERIES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION, VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION.getEAllOperations().get(64));
      try
      {
        GET_CHARACTERISTICSOF_LABORAND_DELIVERIES__EOCL_QRY = helper.createQuery(GET_CHARACTERISTICSOF_LABORAND_DELIVERIES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_CHARACTERISTICSOF_LABORAND_DELIVERIES__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<CharacteristicofLaborandDelivery> result = (Collection<CharacteristicofLaborandDelivery>) query.evaluate(laborandDeliveryInformation);
    return new BasicEList.UnmodifiableEList<CharacteristicofLaborandDelivery>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getHomeBirthPlan(LaborandDeliveryInformation) <em>Get Home Birth Plan</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHomeBirthPlan(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
	protected static final String GET_HOME_BIRTH_PLAN__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Planned Home Birth))->asSequence()->any(true).oclAsType(vsbr::Planned Home Birth)";

	/**
   * The cached OCL query for the '{@link #getHomeBirthPlan(LaborandDeliveryInformation) <em>Get Home Birth Plan</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getHomeBirthPlan(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_HOME_BIRTH_PLAN__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */

	public static PlannedHomeBirth getHomeBirthPlan(LaborandDeliveryInformation laborandDeliveryInformation) {
    if (GET_HOME_BIRTH_PLAN__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION, VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION.getEAllOperations().get(65));
      try
      {
        GET_HOME_BIRTH_PLAN__EOCL_QRY = helper.createQuery(GET_HOME_BIRTH_PLAN__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_HOME_BIRTH_PLAN__EOCL_QRY);
    return (PlannedHomeBirth) query.evaluate(laborandDeliveryInformation);
  }

	/**
   * The cached OCL expression body for the '{@link #getMaternalTransfer(LaborandDeliveryInformation) <em>Get Maternal Transfer</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMaternalTransfer(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
	protected static final String GET_MATERNAL_TRANSFER__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Maternal Transfer))->asSequence()->any(true).oclAsType(vsbr::Maternal Transfer)";

	/**
   * The cached OCL query for the '{@link #getMaternalTransfer(LaborandDeliveryInformation) <em>Get Maternal Transfer</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMaternalTransfer(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MATERNAL_TRANSFER__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */

	public static MaternalTransfer getMaternalTransfer(LaborandDeliveryInformation laborandDeliveryInformation) {
    if (GET_MATERNAL_TRANSFER__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION, VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION.getEAllOperations().get(66));
      try
      {
        GET_MATERNAL_TRANSFER__EOCL_QRY = helper.createQuery(GET_MATERNAL_TRANSFER__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MATERNAL_TRANSFER__EOCL_QRY);
    return (MaternalTransfer) query.evaluate(laborandDeliveryInformation);
  }

	/**
   * The cached OCL expression body for the '{@link #getMaternalMorbiditiess(LaborandDeliveryInformation) <em>Get Maternal Morbiditiess</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMaternalMorbiditiess(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
	protected static final String GET_MATERNAL_MORBIDITIESS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Maternal Morbidity)).oclAsType(vsbr::Maternal Morbidity)";

	/**
   * The cached OCL query for the '{@link #getMaternalMorbiditiess(LaborandDeliveryInformation) <em>Get Maternal Morbiditiess</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMaternalMorbiditiess(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MATERNAL_MORBIDITIESS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */

	public static EList<MaternalMorbidity> getMaternalMorbiditiess(
			LaborandDeliveryInformation laborandDeliveryInformation) {
    if (GET_MATERNAL_MORBIDITIESS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION, VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION.getEAllOperations().get(67));
      try
      {
        GET_MATERNAL_MORBIDITIESS__EOCL_QRY = helper.createQuery(GET_MATERNAL_MORBIDITIESS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MATERNAL_MORBIDITIESS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<MaternalMorbidity> result = (Collection<MaternalMorbidity>) query.evaluate(laborandDeliveryInformation);
    return new BasicEList.UnmodifiableEList<MaternalMorbidity>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getRiskFactorss(LaborandDeliveryInformation) <em>Get Risk Factorss</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRiskFactorss(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
	protected static final String GET_RISK_FACTORSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Pregnancy Risk Factor)).oclAsType(vsbr::Pregnancy Risk Factor)";

	/**
   * The cached OCL query for the '{@link #getRiskFactorss(LaborandDeliveryInformation) <em>Get Risk Factorss</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getRiskFactorss(LaborandDeliveryInformation)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_RISK_FACTORSS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */

	public static EList<PregnancyRiskFactor> getRiskFactorss(LaborandDeliveryInformation laborandDeliveryInformation) {
    if (GET_RISK_FACTORSS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION, VsbrPackage.Literals.LABORAND_DELIVERY_INFORMATION.getEAllOperations().get(68));
      try
      {
        GET_RISK_FACTORSS__EOCL_QRY = helper.createQuery(GET_RISK_FACTORSS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_RISK_FACTORSS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<PregnancyRiskFactor> result = (Collection<PregnancyRiskFactor>) query.evaluate(laborandDeliveryInformation);
    return new BasicEList.UnmodifiableEList<PregnancyRiskFactor>(result.size(), result.toArray());
  }

} // LaborandDeliveryInformationOperations
