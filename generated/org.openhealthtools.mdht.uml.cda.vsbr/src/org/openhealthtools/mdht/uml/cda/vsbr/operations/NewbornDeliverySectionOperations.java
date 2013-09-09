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

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

import org.openhealthtools.mdht.uml.cda.vsbr.AbnormalConditionoftheNewborn;
import org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder;
import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly;
import org.openhealthtools.mdht.uml.cda.vsbr.InfantBreastfed;
import org.openhealthtools.mdht.uml.cda.vsbr.InfantLiving;
import org.openhealthtools.mdht.uml.cda.vsbr.InfantTransfer;
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.NewbornsVitalSignsSection;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive;
import org.openhealthtools.mdht.uml.cda.vsbr.Plurality;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Newborn Delivery Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionBirthOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNumberofInfantsBornAlive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Numberof Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionCongenitalAnomalies(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Congenital Anomalies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornsVitalSignsSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborns Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionAbnormalConditionsoftheNewborn(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Abnormal Conditionsofthe Newborn</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionInfantLiving(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Infant Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionInfantBreastfed(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Infant Breastfed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionInfantTransfer(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Infant Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionPlurality(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Plurality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn SDTC Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Administrative Gender Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Birth Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#validateNewbornDeliverySectionNewbornSubjectRelatedSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Related Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getBirthOrder() <em>Get Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getNumberofInfantsBornAlive() <em>Get Numberof Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getCongenitalAnomaliess() <em>Get Congenital Anomaliess</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getNewbornsVitalSignsSection() <em>Get Newborns Vital Signs Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getAbnormalConditionsoftheNewborns() <em>Get Abnormal Conditionsofthe Newborns</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getInfantLiving() <em>Get Infant Living</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getInfantBreastfed() <em>Get Infant Breastfed</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getInfantTransfer() <em>Get Infant Transfer</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.NewbornDeliverySection#getPlurality() <em>Get Plurality</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NewbornDeliverySectionOperations extends SectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NewbornDeliverySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionTemplateId(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionTemplateId(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.10')";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionTemplateId(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionTemplateId(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionTemplateId(NewbornDeliverySection newbornDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_TEMPLATE_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionTemplateId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionClassCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionClassCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClass::DOCSECT";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionClassCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionClassCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionClassCode(NewbornDeliverySection newbornDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionMoodCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionMoodCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionMoodCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionMoodCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionMoodCode(NewbornDeliverySection newbornDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_MOOD_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionMoodCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in "
			+ "value.code = '57075-4' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionCode(NewbornDeliverySection newbornDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionText(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionText(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionText(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionText(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionText(NewbornDeliverySection newbornDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_TEXT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionText",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionSubject(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionSubject(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->one(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::Subject))";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionSubject(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Subject</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionSubject(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionSubject(NewbornDeliverySection newbornDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_DELIVERY_SECTION_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_SUBJECT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionSubject",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionBirthOrder(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Birth Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionBirthOrder(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::BirthOrder) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionBirthOrder(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Birth Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionBirthOrder(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionBirthOrder(NewbornDeliverySection newbornDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_DELIVERY_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_BIRTH_ORDER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionBirthOrder",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionNumberofInfantsBornAlive(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Numberof Infants Born Alive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNumberofInfantsBornAlive(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::NumberofInfantsBornAlive) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionNumberofInfantsBornAlive(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Numberof Infants Born Alive</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNumberofInfantsBornAlive(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionNumberofInfantsBornAlive(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_NUMBEROF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NUMBEROF_INFANTS_BORN_ALIVE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionNumberofInfantsBornAlive",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionCongenitalAnomalies(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Congenital Anomalies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionCongenitalAnomalies(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_CONGENITAL_ANOMALIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::CongenitalAnomaly) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionCongenitalAnomalies(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Congenital Anomalies</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionCongenitalAnomalies(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_CONGENITAL_ANOMALIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionCongenitalAnomalies(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_CONGENITAL_ANOMALIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_CONGENITAL_ANOMALIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_CONGENITAL_ANOMALIES__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_CONGENITAL_ANOMALIES__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_CONGENITAL_ANOMALIES,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionCongenitalAnomalies",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionNewbornsVitalSignsSection(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborns Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornsVitalSignsSection(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORNS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::NewbornsVitalSignsSection))";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionNewbornsVitalSignsSection(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborns Vital Signs Section</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornsVitalSignsSection(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORNS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionNewbornsVitalSignsSection(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORNS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORNS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORNS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORNS_VITAL_SIGNS_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORNS_VITAL_SIGNS_SECTION,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionNewbornsVitalSignsSection",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionAbnormalConditionsoftheNewborn(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Abnormal Conditionsofthe Newborn</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionAbnormalConditionsoftheNewborn(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::AbnormalConditionoftheNewborn) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionAbnormalConditionsoftheNewborn(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Abnormal Conditionsofthe Newborn</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionAbnormalConditionsoftheNewborn(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionAbnormalConditionsoftheNewborn(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_ABNORMAL_CONDITIONSOFTHE_NEWBORN,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionAbnormalConditionsoftheNewborn",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionInfantLiving(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Infant Living</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionInfantLiving(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::InfantLiving) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionInfantLiving(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Infant Living</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionInfantLiving(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionInfantLiving(NewbornDeliverySection newbornDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_LIVING__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_INFANT_LIVING,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionInfantLiving",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionInfantBreastfed(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Infant Breastfed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionInfantBreastfed(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_BREASTFED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::InfantBreastfed) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionInfantBreastfed(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Infant Breastfed</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionInfantBreastfed(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_BREASTFED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionInfantBreastfed(NewbornDeliverySection newbornDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_BREASTFED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_BREASTFED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_BREASTFED__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_BREASTFED__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_INFANT_BREASTFED,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionInfantBreastfed",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionInfantTransfer(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Infant Transfer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionInfantTransfer(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::InfantTransfer) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionInfantTransfer(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Infant Transfer</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionInfantTransfer(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionInfantTransfer(NewbornDeliverySection newbornDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_DELIVERY_SECTION_INFANT_TRANSFER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_INFANT_TRANSFER,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionInfantTransfer",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionPlurality(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Plurality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionPlurality(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Plurality) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionPlurality(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Plurality</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionPlurality(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionPlurality(NewbornDeliverySection newbornDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_NEWBORN_DELIVERY_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_PLURALITY,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionPlurality",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClass::PSN)";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Determiner Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject(isDefined('determinerCode') and determinerCode=vocab::EntityDeterminer::INSTANCE)";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Determiner Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_DETERMINER_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornDeterminerCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn SDTC Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_SDTC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((sDTCId->isEmpty() or sDTCId->exists(element | element.isNullFlavorUndefined())) implies (sDTCId->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn SDTC Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_SDTC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_SDTC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_SDTC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_SDTC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_SDTC_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_SDTC_ID,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornSDTCId",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_NAME,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornName",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Administrative Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in "
			+ "value.codeSystem = '2.16.840.1.113883.5.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Administrative Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Administrative Gender Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Administrative Gender Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_ADMINISTRATIVE_GENDER_CODE_P,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornAdministrativeGenderCodeP",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Birth Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((birthTime.oclIsUndefined() or birthTime.isNullFlavorUndefined()) implies (not birthTime.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Newborn Birth Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_BIRTH_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_NEWBORN_BIRTH_TIME,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionNewbornSubjectRoleOfNewbornNewbornBirthTime",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null)->reject(isDefined('classCode') and classCode=vocab::x_DocumentSubject::PRS)";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CLASS_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionNewbornSubjectRoleOfNewbornClassCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null)->reject((code.oclIsUndefined() or code.isNullFlavorUndefined()) implies (not code.oclIsUndefined() and code.oclIsKindOf(datatypes::CE) and "
			+ "let value : datatypes::CE = code.oclAsType(datatypes::CE) in "
			+ "value.code = 'CHILD' and value.codeSystem = '2.16.840.1.113883.5.111'))";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionNewbornSubjectRoleOfNewbornCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null)->reject(subject->one(subject : cda::SubjectPerson | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::SubjectPerson)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Role Of Newborn Subject</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR,
					VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_ROLE_OF_NEWBORN_SUBJECT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionNewbornSubjectRoleOfNewbornSubject",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionNewbornSubjectTypeCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectTypeCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationTargetSubject::SBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionNewbornSubjectTypeCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectTypeCode(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionNewbornSubjectTypeCode(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_TYPE_CODE,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionNewbornSubjectTypeCode",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateNewbornDeliverySectionNewbornSubjectRelatedSubject(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Related Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRelatedSubject(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_RELATED_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null)->reject(relatedSubject->one(relatedSubject : cda::RelatedSubject | not relatedSubject.oclIsUndefined() and relatedSubject.oclIsKindOf(cda::RelatedSubject)))";

	/**
	 * The cached OCL invariant for the '{@link #validateNewbornDeliverySectionNewbornSubjectRelatedSubject(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Newborn Delivery Section Newborn Subject Related Subject</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateNewbornDeliverySectionNewbornSubjectRelatedSubject(NewbornDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static Constraint VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_RELATED_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param newbornDeliverySection The receiving '<em><b>Newborn Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateNewbornDeliverySectionNewbornSubjectRelatedSubject(
			NewbornDeliverySection newbornDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_RELATED_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION);
			try {
				VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_RELATED_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_RELATED_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(
			VALIDATE_NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_RELATED_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(
			newbornDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(new BasicDiagnostic(
					Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
					VsbrValidator.NEWBORN_DELIVERY_SECTION__NEWBORN_DELIVERY_SECTION_NEWBORN_SUBJECT_RELATED_SUBJECT,
					org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
						"_UI_GenericInvariant_diagnostic",
						new Object[] {
								"NewbornDeliverySectionNewbornSubjectRelatedSubject",
								org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
									newbornDeliverySection, context) }), new Object[] { newbornDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getBirthOrder(NewbornDeliverySection) <em>Get Birth Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthOrder(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BIRTH_ORDER__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::BirthOrder))->asSequence()->any(true).oclAsType(vsbr::BirthOrder)";

	/**
	 * The cached OCL query for the '{@link #getBirthOrder(NewbornDeliverySection) <em>Get Birth Order</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthOrder(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BIRTH_ORDER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static BirthOrder getBirthOrder(NewbornDeliverySection newbornDeliverySection) {
		if (GET_BIRTH_ORDER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION,
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION.getEAllOperations().get(82));
			try {
				GET_BIRTH_ORDER__EOCL_QRY = helper.createQuery(GET_BIRTH_ORDER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_BIRTH_ORDER__EOCL_QRY);
		return (BirthOrder) query.evaluate(newbornDeliverySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNumberofInfantsBornAlive(NewbornDeliverySection) <em>Get Numberof Infants Born Alive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberofInfantsBornAlive(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::NumberofInfantsBornAlive))->asSequence()->any(true).oclAsType(vsbr::NumberofInfantsBornAlive)";

	/**
	 * The cached OCL query for the '{@link #getNumberofInfantsBornAlive(NewbornDeliverySection) <em>Get Numberof Infants Born Alive</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberofInfantsBornAlive(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static NumberofInfantsBornAlive getNumberofInfantsBornAlive(NewbornDeliverySection newbornDeliverySection) {
		if (GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION,
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION.getEAllOperations().get(83));
			try {
				GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_QRY = helper.createQuery(GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NUMBEROF_INFANTS_BORN_ALIVE__EOCL_QRY);
		return (NumberofInfantsBornAlive) query.evaluate(newbornDeliverySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCongenitalAnomaliess(NewbornDeliverySection) <em>Get Congenital Anomaliess</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCongenitalAnomaliess(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONGENITAL_ANOMALIESS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::CongenitalAnomaly)).oclAsType(vsbr::CongenitalAnomaly)";

	/**
	 * The cached OCL query for the '{@link #getCongenitalAnomaliess(NewbornDeliverySection) <em>Get Congenital Anomaliess</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCongenitalAnomaliess(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONGENITAL_ANOMALIESS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CongenitalAnomaly> getCongenitalAnomaliess(NewbornDeliverySection newbornDeliverySection) {
		if (GET_CONGENITAL_ANOMALIESS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION,
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION.getEAllOperations().get(84));
			try {
				GET_CONGENITAL_ANOMALIESS__EOCL_QRY = helper.createQuery(GET_CONGENITAL_ANOMALIESS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_CONGENITAL_ANOMALIESS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CongenitalAnomaly> result = (Collection<CongenitalAnomaly>) query.evaluate(newbornDeliverySection);
		return new BasicEList.UnmodifiableEList<CongenitalAnomaly>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getNewbornsVitalSignsSection(NewbornDeliverySection) <em>Get Newborns Vital Signs Section</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewbornsVitalSignsSection(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NEWBORNS_VITAL_SIGNS_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(vsbr::NewbornsVitalSignsSection))->asSequence()->any(true).oclAsType(vsbr::NewbornsVitalSignsSection)";

	/**
	 * The cached OCL query for the '{@link #getNewbornsVitalSignsSection(NewbornDeliverySection) <em>Get Newborns Vital Signs Section</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNewbornsVitalSignsSection(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NEWBORNS_VITAL_SIGNS_SECTION__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static NewbornsVitalSignsSection getNewbornsVitalSignsSection(NewbornDeliverySection newbornDeliverySection) {
		if (GET_NEWBORNS_VITAL_SIGNS_SECTION__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION,
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION.getEAllOperations().get(85));
			try {
				GET_NEWBORNS_VITAL_SIGNS_SECTION__EOCL_QRY = helper.createQuery(GET_NEWBORNS_VITAL_SIGNS_SECTION__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_NEWBORNS_VITAL_SIGNS_SECTION__EOCL_QRY);
		return (NewbornsVitalSignsSection) query.evaluate(newbornDeliverySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAbnormalConditionsoftheNewborns(NewbornDeliverySection) <em>Get Abnormal Conditionsofthe Newborns</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbnormalConditionsoftheNewborns(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_ABNORMAL_CONDITIONSOFTHE_NEWBORNS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::AbnormalConditionoftheNewborn)).oclAsType(vsbr::AbnormalConditionoftheNewborn)";

	/**
	 * The cached OCL query for the '{@link #getAbnormalConditionsoftheNewborns(NewbornDeliverySection) <em>Get Abnormal Conditionsofthe Newborns</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAbnormalConditionsoftheNewborns(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_ABNORMAL_CONDITIONSOFTHE_NEWBORNS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<AbnormalConditionoftheNewborn> getAbnormalConditionsoftheNewborns(
			NewbornDeliverySection newbornDeliverySection) {
		if (GET_ABNORMAL_CONDITIONSOFTHE_NEWBORNS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION,
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION.getEAllOperations().get(86));
			try {
				GET_ABNORMAL_CONDITIONSOFTHE_NEWBORNS__EOCL_QRY = helper.createQuery(GET_ABNORMAL_CONDITIONSOFTHE_NEWBORNS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_ABNORMAL_CONDITIONSOFTHE_NEWBORNS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<AbnormalConditionoftheNewborn> result = (Collection<AbnormalConditionoftheNewborn>) query.evaluate(newbornDeliverySection);
		return new BasicEList.UnmodifiableEList<AbnormalConditionoftheNewborn>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfantLiving(NewbornDeliverySection) <em>Get Infant Living</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfantLiving(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFANT_LIVING__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::InfantLiving))->asSequence()->any(true).oclAsType(vsbr::InfantLiving)";

	/**
	 * The cached OCL query for the '{@link #getInfantLiving(NewbornDeliverySection) <em>Get Infant Living</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfantLiving(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFANT_LIVING__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static InfantLiving getInfantLiving(NewbornDeliverySection newbornDeliverySection) {
		if (GET_INFANT_LIVING__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION,
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION.getEAllOperations().get(87));
			try {
				GET_INFANT_LIVING__EOCL_QRY = helper.createQuery(GET_INFANT_LIVING__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFANT_LIVING__EOCL_QRY);
		return (InfantLiving) query.evaluate(newbornDeliverySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfantBreastfed(NewbornDeliverySection) <em>Get Infant Breastfed</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfantBreastfed(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFANT_BREASTFED__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::InfantBreastfed))->asSequence()->any(true).oclAsType(vsbr::InfantBreastfed)";

	/**
	 * The cached OCL query for the '{@link #getInfantBreastfed(NewbornDeliverySection) <em>Get Infant Breastfed</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfantBreastfed(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFANT_BREASTFED__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static InfantBreastfed getInfantBreastfed(NewbornDeliverySection newbornDeliverySection) {
		if (GET_INFANT_BREASTFED__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION,
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION.getEAllOperations().get(88));
			try {
				GET_INFANT_BREASTFED__EOCL_QRY = helper.createQuery(GET_INFANT_BREASTFED__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFANT_BREASTFED__EOCL_QRY);
		return (InfantBreastfed) query.evaluate(newbornDeliverySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getInfantTransfer(NewbornDeliverySection) <em>Get Infant Transfer</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfantTransfer(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_INFANT_TRANSFER__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::InfantTransfer))->asSequence()->any(true).oclAsType(vsbr::InfantTransfer)";

	/**
	 * The cached OCL query for the '{@link #getInfantTransfer(NewbornDeliverySection) <em>Get Infant Transfer</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInfantTransfer(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_INFANT_TRANSFER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static InfantTransfer getInfantTransfer(NewbornDeliverySection newbornDeliverySection) {
		if (GET_INFANT_TRANSFER__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION,
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION.getEAllOperations().get(89));
			try {
				GET_INFANT_TRANSFER__EOCL_QRY = helper.createQuery(GET_INFANT_TRANSFER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_INFANT_TRANSFER__EOCL_QRY);
		return (InfantTransfer) query.evaluate(newbornDeliverySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlurality(NewbornDeliverySection) <em>Get Plurality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlurality(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLURALITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Plurality))->asSequence()->any(true).oclAsType(vsbr::Plurality)";

	/**
	 * The cached OCL query for the '{@link #getPlurality(NewbornDeliverySection) <em>Get Plurality</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlurality(NewbornDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLURALITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static Plurality getPlurality(NewbornDeliverySection newbornDeliverySection) {
		if (GET_PLURALITY__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION,
				VsbrPackage.Literals.NEWBORN_DELIVERY_SECTION.getEAllOperations().get(90));
			try {
				GET_PLURALITY__EOCL_QRY = helper.createQuery(GET_PLURALITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_PLURALITY__EOCL_QRY);
		return (Plurality) query.evaluate(newbornDeliverySection);
	}

} // NewbornDeliverySectionOperations
