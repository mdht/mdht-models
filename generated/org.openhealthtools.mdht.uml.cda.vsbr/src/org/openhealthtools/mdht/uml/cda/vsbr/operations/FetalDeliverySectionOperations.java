/**
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

import org.openhealthtools.mdht.uml.cda.vsbr.AutopsyPerformance;
import org.openhealthtools.mdht.uml.cda.vsbr.BirthOrder;
import org.openhealthtools.mdht.uml.cda.vsbr.CongenitalAnomaly;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeathOccurrance;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection;
import org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliveryTime;
import org.openhealthtools.mdht.uml.cda.vsbr.NumberofInfantsBornAlive;
import org.openhealthtools.mdht.uml.cda.vsbr.Plurality;
import org.openhealthtools.mdht.uml.cda.vsbr.VsbrPackage;

import org.openhealthtools.mdht.uml.cda.vsbr.util.VsbrValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fetal Delivery Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Mood Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionBirthOrder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionNumberOfInfantsBornAlive(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Number Of Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionAutopsyPerformance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Autopsy Performance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeathOccurrance(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Death Occurrance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionPlurality(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Plurality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionCongenitalAnomaly(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Congenital Anomaly</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliveryTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Determiner Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Administrative Gender Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Administrative Gender Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#getBirthOrder() <em>Get Birth Order</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#getNumberOfInfantsBornAlive() <em>Get Number Of Infants Born Alive</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#getAutopsyPerformance() <em>Get Autopsy Performance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#getFetalDeathOccurrance() <em>Get Fetal Death Occurrance</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#getPlurality() <em>Get Plurality</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#getCongenitalAnomalies() <em>Get Congenital Anomalies</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.vsbr.FetalDeliverySection#getFetalDeliveryTime() <em>Get Fetal Delivery Time</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FetalDeliverySectionOperations extends org.eclipse.mdht.uml.cda.operations.SectionOperations {
	protected static final ThreadLocal<OCL> EOCL_ENV = new ThreadLocal<OCL>() {
		@Override
		public OCL initialValue() {
			return OCL.newInstance();
		}
	};

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FetalDeliverySectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionTemplateId(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionTemplateId(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.26.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionTemplateId(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionTemplateId(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionTemplateId(FetalDeliverySection fetalDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_TEMPLATE_ID,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionTemplateId",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionClassCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionClassCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('classCode') and self.classCode=vocab::ActClass::DOCSECT";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionClassCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionClassCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionClassCode(FetalDeliverySection fetalDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FETAL_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionMoodCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Mood Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionMoodCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('moodCode') and self.moodCode=vocab::ActMood::EVN";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionMoodCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Mood Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionMoodCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionMoodCode(FetalDeliverySection fetalDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FETAL_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_MOOD_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionMoodCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionCode(FetalDeliverySection fetalDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FETAL_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionText(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionText(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionText(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionText(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionText(FetalDeliverySection fetalDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FETAL_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_TEXT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionText",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionBirthOrder(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Birth Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionBirthOrder(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::BirthOrder) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionBirthOrder(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Birth Order</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionBirthOrder(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionBirthOrder(FetalDeliverySection fetalDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_BIRTH_ORDER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_BIRTH_ORDER,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionBirthOrder",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionNumberOfInfantsBornAlive(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Number Of Infants Born Alive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionNumberOfInfantsBornAlive(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_NUMBER_OF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::NumberofInfantsBornAlive) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionNumberOfInfantsBornAlive(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Number Of Infants Born Alive</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionNumberOfInfantsBornAlive(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_NUMBER_OF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionNumberOfInfantsBornAlive(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_NUMBER_OF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_NUMBER_OF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_NUMBER_OF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_NUMBER_OF_INFANTS_BORN_ALIVE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_NUMBER_OF_INFANTS_BORN_ALIVE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionNumberOfInfantsBornAlive",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionAutopsyPerformance(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Autopsy Performance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionAutopsyPerformance(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::AutopsyPerformance) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionAutopsyPerformance(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Autopsy Performance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionAutopsyPerformance(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionAutopsyPerformance(FetalDeliverySection fetalDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_AUTOPSY_PERFORMANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_AUTOPSY_PERFORMANCE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionAutopsyPerformance",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionFetalDeathOccurrance(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Death Occurrance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeathOccurrance(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DEATH_OCCURRANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::FetalDeathOccurrance) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionFetalDeathOccurrance(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Death Occurrance</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeathOccurrance(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DEATH_OCCURRANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionFetalDeathOccurrance(FetalDeliverySection fetalDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DEATH_OCCURRANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DEATH_OCCURRANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DEATH_OCCURRANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DEATH_OCCURRANCE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DEATH_OCCURRANCE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionFetalDeathOccurrance",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionPlurality(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Plurality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionPlurality(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::Plurality) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionPlurality(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Plurality</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionPlurality(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionPlurality(FetalDeliverySection fetalDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FETAL_DELIVERY_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_PLURALITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_PLURALITY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionPlurality",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionCongenitalAnomaly(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Congenital Anomaly</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionCongenitalAnomaly(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_CONGENITAL_ANOMALY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::CongenitalAnomaly) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionCongenitalAnomaly(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Congenital Anomaly</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionCongenitalAnomaly(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_CONGENITAL_ANOMALY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionCongenitalAnomaly(FetalDeliverySection fetalDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_CONGENITAL_ANOMALY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_CONGENITAL_ANOMALY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_CONGENITAL_ANOMALY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_CONGENITAL_ANOMALY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_CONGENITAL_ANOMALY,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionCongenitalAnomaly",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionFetalDeliveryTime(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliveryTime(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->one(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(vsbr::FetalDeliveryTime) and entry.typeCode = vocab::x_ActRelationshipEntry::COMP)";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionFetalDeliveryTime(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Time</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliveryTime(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionFetalDeliveryTime(FetalDeliverySection fetalDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_TIME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionFetalDeliveryTime",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionFetalDeliverySubject(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubject(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies subject->one(subject : cda::Subject | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::Subject))";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionFetalDeliverySubject(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubject(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionFetalDeliverySubject(FetalDeliverySection fetalDeliverySection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionFetalDeliverySubject",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject(isDefined('classCode') and classCode=vocab::EntityClass::PSN)";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Determiner Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject(isDefined('determinerCode') and determinerCode=vocab::EntityDeterminer::INSTANCE)";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Determiner Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_DETERMINER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_DETERMINER_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusDeterminerCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Name</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (not name->isEmpty()))";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Name</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_NAME,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusName",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Administrative Gender Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined() and administrativeGenderCode.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = administrativeGenderCode.oclAsType(datatypes::CE) in " +
			"value.codeSystem = '2.16.840.1.113883.5.1'))";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Administrative Gender Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Administrative Gender Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null).subject->excluding(null)->reject((administrativeGenderCode.oclIsUndefined() or administrativeGenderCode.isNullFlavorUndefined()) implies (not administrativeGenderCode.oclIsUndefined()))";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus Administrative Gender Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS_ADMINISTRATIVE_GENDER_CODE_P,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetusAdministrativeGenderCodeP",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Class Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null)->reject(isDefined('classCode') and classCode=vocab::x_DocumentSubject::PRS)";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Class Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_CLASS_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionFetalDeliverySubjectRoleOfFetusClassCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null).relatedSubject->excluding(null)->reject(subject->one(subject : cda::SubjectPerson | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::SubjectPerson)))";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus Fetus</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS_FETUS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionFetalDeliverySubjectRoleOfFetusFetus",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectTypeCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Type Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectTypeCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationTargetSubject::SBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectTypeCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Type Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectTypeCode(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionFetalDeliverySubjectTypeCode(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_TYPE_CODE,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionFetalDeliverySubjectTypeCode",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->excluding(null)->reject(relatedSubject->one(relatedSubject : cda::RelatedSubject | not relatedSubject.oclIsUndefined() and relatedSubject.oclIsKindOf(cda::RelatedSubject)))";

	/**
	 * The cached OCL invariant for the '{@link #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetal Delivery Section Fetal Delivery Subject Role Of Fetus</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus(FetalDeliverySection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetalDeliverySection The receiving '<em><b>Fetal Delivery Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetalDeliverySectionFetalDeliverySubjectRoleOfFetus(
			FetalDeliverySection fetalDeliverySection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(VsbrPackage.Literals.FETAL_DELIVERY_SECTION);
			try {
				VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetalDeliverySection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, VsbrValidator.DIAGNOSTIC_SOURCE,
						VsbrValidator.FETAL_DELIVERY_SECTION__FETAL_DELIVERY_SECTION_FETAL_DELIVERY_SUBJECT_ROLE_OF_FETUS,
						org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString(
							"_UI_GenericInvariant_diagnostic",
							new Object[] {
									"FetalDeliverySectionFetalDeliverySectionFetalDeliverySubjectRoleOfFetus",
									org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(
										fetalDeliverySection, context) }),
						new Object[] { fetalDeliverySection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getBirthOrder(FetalDeliverySection) <em>Get Birth Order</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthOrder(FetalDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_BIRTH_ORDER__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::BirthOrder))->asSequence()->any(true).oclAsType(vsbr::BirthOrder)";

	/**
	 * The cached OCL query for the '{@link #getBirthOrder(FetalDeliverySection) <em>Get Birth Order</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBirthOrder(FetalDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_BIRTH_ORDER__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static BirthOrder getBirthOrder(FetalDeliverySection fetalDeliverySection) {

		if (GET_BIRTH_ORDER__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.FETAL_DELIVERY_SECTION,
				VsbrPackage.Literals.FETAL_DELIVERY_SECTION.getEAllOperations().get(77));
			try {
				GET_BIRTH_ORDER__EOCL_QRY = helper.createQuery(GET_BIRTH_ORDER__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_BIRTH_ORDER__EOCL_QRY);
		return (BirthOrder) query.evaluate(fetalDeliverySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getNumberOfInfantsBornAlive(FetalDeliverySection) <em>Get Number Of Infants Born Alive</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInfantsBornAlive(FetalDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_NUMBER_OF_INFANTS_BORN_ALIVE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::NumberofInfantsBornAlive))->asSequence()->any(true).oclAsType(vsbr::NumberofInfantsBornAlive)";

	/**
	 * The cached OCL query for the '{@link #getNumberOfInfantsBornAlive(FetalDeliverySection) <em>Get Number Of Infants Born Alive</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfInfantsBornAlive(FetalDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_NUMBER_OF_INFANTS_BORN_ALIVE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static NumberofInfantsBornAlive getNumberOfInfantsBornAlive(FetalDeliverySection fetalDeliverySection) {

		if (GET_NUMBER_OF_INFANTS_BORN_ALIVE__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.FETAL_DELIVERY_SECTION,
				VsbrPackage.Literals.FETAL_DELIVERY_SECTION.getEAllOperations().get(78));
			try {
				GET_NUMBER_OF_INFANTS_BORN_ALIVE__EOCL_QRY = helper.createQuery(
					GET_NUMBER_OF_INFANTS_BORN_ALIVE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_NUMBER_OF_INFANTS_BORN_ALIVE__EOCL_QRY);
		return (NumberofInfantsBornAlive) query.evaluate(fetalDeliverySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getAutopsyPerformance(FetalDeliverySection) <em>Get Autopsy Performance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutopsyPerformance(FetalDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_AUTOPSY_PERFORMANCE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::AutopsyPerformance))->asSequence()->any(true).oclAsType(vsbr::AutopsyPerformance)";

	/**
	 * The cached OCL query for the '{@link #getAutopsyPerformance(FetalDeliverySection) <em>Get Autopsy Performance</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAutopsyPerformance(FetalDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_AUTOPSY_PERFORMANCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static AutopsyPerformance getAutopsyPerformance(FetalDeliverySection fetalDeliverySection) {

		if (GET_AUTOPSY_PERFORMANCE__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.FETAL_DELIVERY_SECTION,
				VsbrPackage.Literals.FETAL_DELIVERY_SECTION.getEAllOperations().get(79));
			try {
				GET_AUTOPSY_PERFORMANCE__EOCL_QRY = helper.createQuery(GET_AUTOPSY_PERFORMANCE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_AUTOPSY_PERFORMANCE__EOCL_QRY);
		return (AutopsyPerformance) query.evaluate(fetalDeliverySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getFetalDeathOccurrance(FetalDeliverySection) <em>Get Fetal Death Occurrance</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetalDeathOccurrance(FetalDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FETAL_DEATH_OCCURRANCE__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::FetalDeathOccurrance))->asSequence()->any(true).oclAsType(vsbr::FetalDeathOccurrance)";

	/**
	 * The cached OCL query for the '{@link #getFetalDeathOccurrance(FetalDeliverySection) <em>Get Fetal Death Occurrance</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetalDeathOccurrance(FetalDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FETAL_DEATH_OCCURRANCE__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FetalDeathOccurrance getFetalDeathOccurrance(FetalDeliverySection fetalDeliverySection) {

		if (GET_FETAL_DEATH_OCCURRANCE__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.FETAL_DELIVERY_SECTION,
				VsbrPackage.Literals.FETAL_DELIVERY_SECTION.getEAllOperations().get(80));
			try {
				GET_FETAL_DEATH_OCCURRANCE__EOCL_QRY = helper.createQuery(GET_FETAL_DEATH_OCCURRANCE__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FETAL_DEATH_OCCURRANCE__EOCL_QRY);
		return (FetalDeathOccurrance) query.evaluate(fetalDeliverySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getPlurality(FetalDeliverySection) <em>Get Plurality</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlurality(FetalDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_PLURALITY__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::Plurality))->asSequence()->any(true).oclAsType(vsbr::Plurality)";

	/**
	 * The cached OCL query for the '{@link #getPlurality(FetalDeliverySection) <em>Get Plurality</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlurality(FetalDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_PLURALITY__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static Plurality getPlurality(FetalDeliverySection fetalDeliverySection) {

		if (GET_PLURALITY__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.FETAL_DELIVERY_SECTION,
				VsbrPackage.Literals.FETAL_DELIVERY_SECTION.getEAllOperations().get(81));
			try {
				GET_PLURALITY__EOCL_QRY = helper.createQuery(GET_PLURALITY__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_PLURALITY__EOCL_QRY);
		return (Plurality) query.evaluate(fetalDeliverySection);
	}

	/**
	 * The cached OCL expression body for the '{@link #getCongenitalAnomalies(FetalDeliverySection) <em>Get Congenital Anomalies</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCongenitalAnomalies(FetalDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_CONGENITAL_ANOMALIES__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::CongenitalAnomaly)).oclAsType(vsbr::CongenitalAnomaly)";

	/**
	 * The cached OCL query for the '{@link #getCongenitalAnomalies(FetalDeliverySection) <em>Get Congenital Anomalies</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCongenitalAnomalies(FetalDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_CONGENITAL_ANOMALIES__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<CongenitalAnomaly> getCongenitalAnomalies(FetalDeliverySection fetalDeliverySection) {

		if (GET_CONGENITAL_ANOMALIES__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.FETAL_DELIVERY_SECTION,
				VsbrPackage.Literals.FETAL_DELIVERY_SECTION.getEAllOperations().get(82));
			try {
				GET_CONGENITAL_ANOMALIES__EOCL_QRY = helper.createQuery(GET_CONGENITAL_ANOMALIES__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_CONGENITAL_ANOMALIES__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<CongenitalAnomaly> result = (Collection<CongenitalAnomaly>) query.evaluate(fetalDeliverySection);
		return new BasicEList.UnmodifiableEList<CongenitalAnomaly>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getFetalDeliveryTime(FetalDeliverySection) <em>Get Fetal Delivery Time</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetalDeliveryTime(FetalDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_FETAL_DELIVERY_TIME__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(vsbr::FetalDeliveryTime))->asSequence()->any(true).oclAsType(vsbr::FetalDeliveryTime)";

	/**
	 * The cached OCL query for the '{@link #getFetalDeliveryTime(FetalDeliverySection) <em>Get Fetal Delivery Time</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFetalDeliveryTime(FetalDeliverySection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_FETAL_DELIVERY_TIME__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static FetalDeliveryTime getFetalDeliveryTime(FetalDeliverySection fetalDeliverySection) {

		if (GET_FETAL_DELIVERY_TIME__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				VsbrPackage.Literals.FETAL_DELIVERY_SECTION,
				VsbrPackage.Literals.FETAL_DELIVERY_SECTION.getEAllOperations().get(83));
			try {
				GET_FETAL_DELIVERY_TIME__EOCL_QRY = helper.createQuery(GET_FETAL_DELIVERY_TIME__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_FETAL_DELIVERY_TIME__EOCL_QRY);
		return (FetalDeliveryTime) query.evaluate(fetalDeliverySection);
	}

} // FetalDeliverySectionOperations
