/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.mdht.uml.cda.operations.SectionOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.eclipse.ocl.expressions.OCLExpression;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPlugin;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection;
import org.openhealthtools.mdht.uml.cda.consol.HealthStatusObservation2;
import org.openhealthtools.mdht.uml.cda.consol.RiskConcernAct;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Health Concerns Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionNullFlavor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Null Flavor</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionHealthConcernAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Concern Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionHealthStatusObservation2(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Status Observation2</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#validateHealthConcernsSectionRiskConcernAct(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Risk Concern Act</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#getHealthConcernActs() <em>Get Health Concern Acts</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#getHealthStatusObservation2s() <em>Get Health Status Observation2s</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.HealthConcernsSection#getRiskConcernActs() <em>Get Risk Concern Acts</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class HealthConcernsSectionOperations extends SectionOperations {
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
	protected HealthConcernsSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionTemplateId(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionTemplateId(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.22.2.58' and id.extension = '2015-08-01')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionTemplateId(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionTemplateId(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionTemplateId(HealthConcernsSection healthConcernsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HEALTH_CONCERNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERNS_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionTemplateId"),
						new Object[] { healthConcernsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionNullFlavor(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Null Flavor</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionNullFlavor(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "isDefined('nullFlavor')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionNullFlavor(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Null Flavor</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionNullFlavor(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERNS_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionNullFlavor(HealthConcernsSection healthConcernsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERNS_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HEALTH_CONCERNS_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERNS_SECTION_NULL_FLAVOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_NULL_FLAVOR,
						ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionNullFlavor"),
						new Object[] { healthConcernsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionCode(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionCode(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '75310-3' and value.codeSystem = '2.16.840.1.113883.6.1')";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionCode(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionCode(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionCode(HealthConcernsSection healthConcernsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HEALTH_CONCERNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERNS_SECTION_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_CODE,
						ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionCode"),
						new Object[] { healthConcernsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionCodeP(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code P</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionCodeP(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionCodeP(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Code P</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionCodeP(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionCodeP(HealthConcernsSection healthConcernsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HEALTH_CONCERNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERNS_SECTION_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_CODE_P,
						ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionCodeP"),
						new Object[] { healthConcernsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionTitle(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Title</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionTitle(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionTitle(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Title</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionTitle(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionTitle(HealthConcernsSection healthConcernsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HEALTH_CONCERNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERNS_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_TITLE,
						ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionTitle"),
						new Object[] { healthConcernsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionText(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionText(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionText(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionText(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionText(HealthConcernsSection healthConcernsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_HEALTH_CONCERNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERNS_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_TEXT,
						ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionText"),
						new Object[] { healthConcernsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionHealthConcernAct(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Concern Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionHealthConcernAct(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::HealthConcernAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionHealthConcernAct(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Concern Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionHealthConcernAct(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionHealthConcernAct(HealthConcernsSection healthConcernsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_HEALTH_CONCERN_ACT,
						ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionHealthConcernAct"),
						new Object[] { healthConcernsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionHealthStatusObservation2(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Status Observation2</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionHealthStatusObservation2(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.observation.oclIsUndefined() and entry.observation.oclIsKindOf(consol::HealthStatusObservation2))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionHealthStatusObservation2(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Health Status Observation2</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionHealthStatusObservation2(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionHealthStatusObservation2(
			HealthConcernsSection healthConcernsSection, DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_HEALTH_STATUS_OBSERVATION2,
						ConsolPlugin.INSTANCE.getString(
							"HealthConcernsSectionHealthConcernsSectionHealthStatusObservation2"),
						new Object[] { healthConcernsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateHealthConcernsSectionRiskConcernAct(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Risk Concern Act</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionRiskConcernAct(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.nullFlavor <> vocab::NullFlavor::NI implies entry->exists(entry : cda::Entry | not entry.act.oclIsUndefined() and entry.act.oclIsKindOf(consol::RiskConcernAct))";

	/**
	 * The cached OCL invariant for the '{@link #validateHealthConcernsSectionRiskConcernAct(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Health Concerns Section Risk Concern Act</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateHealthConcernsSectionRiskConcernAct(HealthConcernsSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<Constraint>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param healthConcernsSection The receiving '<em><b>Health Concerns Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateHealthConcernsSectionRiskConcernAct(HealthConcernsSection healthConcernsSection,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		if (VALIDATE_HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.HEALTH_CONCERNS_SECTION);
			try {
				VALIDATE_HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(
						VALIDATE_HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				healthConcernsSection)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.INFO, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.HEALTH_CONCERNS_SECTION__HEALTH_CONCERNS_SECTION_RISK_CONCERN_ACT,
						ConsolPlugin.INSTANCE.getString("HealthConcernsSectionHealthConcernsSectionRiskConcernAct"),
						new Object[] { healthConcernsSection }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getHealthConcernActs(HealthConcernsSection) <em>Get Health Concern Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthConcernActs(HealthConcernsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEALTH_CONCERN_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::HealthConcernAct)).oclAsType(consol::HealthConcernAct)";

	/**
	 * The cached OCL query for the '{@link #getHealthConcernActs(HealthConcernsSection) <em>Get Health Concern Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthConcernActs(HealthConcernsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEALTH_CONCERN_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<HealthConcernAct> getHealthConcernActs(HealthConcernsSection healthConcernsSection) {

		if (GET_HEALTH_CONCERN_ACTS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERNS_SECTION,
				ConsolPackage.Literals.HEALTH_CONCERNS_SECTION.getEAllOperations().get(64));
			try {
				GET_HEALTH_CONCERN_ACTS__EOCL_QRY = helper.createQuery(GET_HEALTH_CONCERN_ACTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HEALTH_CONCERN_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HealthConcernAct> result = (Collection<HealthConcernAct>) query.evaluate(healthConcernsSection);
		return new BasicEList.UnmodifiableEList<HealthConcernAct>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getHealthStatusObservation2s(HealthConcernsSection) <em>Get Health Status Observation2s</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusObservation2s(HealthConcernsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_HEALTH_STATUS_OBSERVATION2S__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::HealthStatusObservation2)).oclAsType(consol::HealthStatusObservation2)";

	/**
	 * The cached OCL query for the '{@link #getHealthStatusObservation2s(HealthConcernsSection) <em>Get Health Status Observation2s</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthStatusObservation2s(HealthConcernsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_HEALTH_STATUS_OBSERVATION2S__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<HealthStatusObservation2> getHealthStatusObservation2s(
			HealthConcernsSection healthConcernsSection) {

		if (GET_HEALTH_STATUS_OBSERVATION2S__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERNS_SECTION,
				ConsolPackage.Literals.HEALTH_CONCERNS_SECTION.getEAllOperations().get(65));
			try {
				GET_HEALTH_STATUS_OBSERVATION2S__EOCL_QRY = helper.createQuery(
					GET_HEALTH_STATUS_OBSERVATION2S__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_HEALTH_STATUS_OBSERVATION2S__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<HealthStatusObservation2> result = (Collection<HealthStatusObservation2>) query.evaluate(
			healthConcernsSection);
		return new BasicEList.UnmodifiableEList<HealthStatusObservation2>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getRiskConcernActs(HealthConcernsSection) <em>Get Risk Concern Acts</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskConcernActs(HealthConcernsSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_RISK_CONCERN_ACTS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::RiskConcernAct)).oclAsType(consol::RiskConcernAct)";

	/**
	 * The cached OCL query for the '{@link #getRiskConcernActs(HealthConcernsSection) <em>Get Risk Concern Acts</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRiskConcernActs(HealthConcernsSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_RISK_CONCERN_ACTS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */

	public static EList<RiskConcernAct> getRiskConcernActs(HealthConcernsSection healthConcernsSection) {

		if (GET_RISK_CONCERN_ACTS__EOCL_QRY == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setOperationContext(
				ConsolPackage.Literals.HEALTH_CONCERNS_SECTION,
				ConsolPackage.Literals.HEALTH_CONCERNS_SECTION.getEAllOperations().get(66));
			try {
				GET_RISK_CONCERN_ACTS__EOCL_QRY = helper.createQuery(GET_RISK_CONCERN_ACTS__EOCL_EXP);
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		OCL.Query query = EOCL_ENV.get().createQuery(GET_RISK_CONCERN_ACTS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<RiskConcernAct> result = (Collection<RiskConcernAct>) query.evaluate(healthConcernsSection);
		return new BasicEList.UnmodifiableEList<RiskConcernAct>(result.size(), result.toArray());
	}

} // HealthConcernsSectionOperations
