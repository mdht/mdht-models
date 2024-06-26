/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;
import org.eclipse.mdht.uml.hl7.rim.operations.RoleOperations;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.FetusSubjectContext;
import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Fetus Subject Context</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FetusSubjectContext#validateFetusSubjectContextTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Subject Context Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FetusSubjectContext#validateFetusSubjectContextCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Subject Context Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.FetusSubjectContext#validateFetusSubjectContextSubject(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Subject Context Subject</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FetusSubjectContextOperations extends RoleOperations {
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
	protected FetusSubjectContextOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetusSubjectContextTemplateId(FetusSubjectContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Subject Context Template Id</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetusSubjectContextTemplateId(FetusSubjectContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETUS_SUBJECT_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '2.16.840.1.113883.10.20.6.2.3')";

	/**
	 * The cached OCL invariant for the '{@link #validateFetusSubjectContextTemplateId(FetusSubjectContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Subject Context Template Id</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetusSubjectContextTemplateId(FetusSubjectContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETUS_SUBJECT_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetusSubjectContext The receiving '<em><b>Fetus Subject Context</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetusSubjectContextTemplateId(FetusSubjectContext fetusSubjectContext,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "FetusSubjectContextFetusSubjectContextTemplateId", "ERROR");

		if (VALIDATE_FETUS_SUBJECT_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FETUS_SUBJECT_CONTEXT);
			try {
				VALIDATE_FETUS_SUBJECT_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FETUS_SUBJECT_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETUS_SUBJECT_CONTEXT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(
				fetusSubjectContext)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FETUS_SUBJECT_CONTEXT__FETUS_SUBJECT_CONTEXT_TEMPLATE_ID,
						ConsolPlugin.INSTANCE.getString("FetusSubjectContextFetusSubjectContextTemplateId"),
						new Object[] { fetusSubjectContext }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetusSubjectContextCode(FetusSubjectContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Subject Context Code</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetusSubjectContextCode(FetusSubjectContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETUS_SUBJECT_CONTEXT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CE) and " +
			"let value : datatypes::CE = self.code.oclAsType(datatypes::CE) in " +
			"value.code = '121026' and value.codeSystem = '1.2.840.10008.2.16.4')";

	/**
	 * The cached OCL invariant for the '{@link #validateFetusSubjectContextCode(FetusSubjectContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Subject Context Code</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetusSubjectContextCode(FetusSubjectContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETUS_SUBJECT_CONTEXT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetusSubjectContext The receiving '<em><b>Fetus Subject Context</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetusSubjectContextCode(FetusSubjectContext fetusSubjectContext,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "FetusSubjectContextFetusSubjectContextCode", "ERROR");

		if (VALIDATE_FETUS_SUBJECT_CONTEXT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FETUS_SUBJECT_CONTEXT);
			try {
				VALIDATE_FETUS_SUBJECT_CONTEXT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FETUS_SUBJECT_CONTEXT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETUS_SUBJECT_CONTEXT_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(fetusSubjectContext)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FETUS_SUBJECT_CONTEXT__FETUS_SUBJECT_CONTEXT_CODE,
						ConsolPlugin.INSTANCE.getString("FetusSubjectContextFetusSubjectContextCode"),
						new Object[] { fetusSubjectContext }));
			}

			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateFetusSubjectContextSubject(FetusSubjectContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Subject Context Subject</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetusSubjectContextSubject(FetusSubjectContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_FETUS_SUBJECT_CONTEXT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.subject->one(subject : cda::SubjectPerson | not subject.oclIsUndefined() and subject.oclIsKindOf(cda::SubjectPerson))";

	/**
	 * The cached OCL invariant for the '{@link #validateFetusSubjectContextSubject(FetusSubjectContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Fetus Subject Context Subject</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateFetusSubjectContextSubject(FetusSubjectContext, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_FETUS_SUBJECT_CONTEXT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param fetusSubjectContext The receiving '<em><b>Fetus Subject Context</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateFetusSubjectContextSubject(FetusSubjectContext fetusSubjectContext,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "FetusSubjectContextFetusSubjectContextSubject", "ERROR");

		if (VALIDATE_FETUS_SUBJECT_CONTEXT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.FETUS_SUBJECT_CONTEXT);
			try {
				VALIDATE_FETUS_SUBJECT_CONTEXT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_FETUS_SUBJECT_CONTEXT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_FETUS_SUBJECT_CONTEXT_SUBJECT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(fetusSubjectContext)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.ERROR, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.FETUS_SUBJECT_CONTEXT__FETUS_SUBJECT_CONTEXT_SUBJECT,
						ConsolPlugin.INSTANCE.getString("FetusSubjectContextFetusSubjectContextSubject"),
						new Object[] { fetusSubjectContext }));
			}

			return false;
		}
		return true;
	}

} // FetusSubjectContextOperations
