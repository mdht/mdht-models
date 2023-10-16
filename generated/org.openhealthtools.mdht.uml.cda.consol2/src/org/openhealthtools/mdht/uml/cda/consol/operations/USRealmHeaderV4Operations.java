/**
 */
package org.openhealthtools.mdht.uml.cda.consol.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.mdht.uml.hl7.datatypes.util.DatatypesUtil;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderV4;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.consol2.ConsolPlugin;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>US Realm Header V4</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.consol.USRealmHeaderV4#validateUSRealmHeaderV4Participant1(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header V4 Participant1</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class USRealmHeaderV4Operations extends USRealmHeader2Operations {

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
	protected USRealmHeaderV4Operations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateUSRealmHeaderV4Participant1(USRealmHeaderV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header V4 Participant1</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderV4Participant1(USRealmHeaderV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_US_REALM_HEADER_V4_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.participant->exists(participant : cda::Participant1 | not participant.oclIsUndefined() and participant.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateUSRealmHeaderV4Participant1(USRealmHeaderV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate US Realm Header V4 Participant1</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateUSRealmHeaderV4Participant1(USRealmHeaderV4, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */

	protected static ThreadLocal<Constraint> VALIDATE_US_REALM_HEADER_V4_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = new ThreadLocal<>();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param usRealmHeaderV4 The receiving '<em><b>US Realm Header V4</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */

	public static boolean validateUSRealmHeaderV4Participant1(USRealmHeaderV4 usRealmHeaderV4,
			DiagnosticChain diagnostics, Map<Object, Object> context) {

		DatatypesUtil.increment(context, "USRealmHeaderV4USRealmHeaderV4Participant1", "WARNING");

		if (VALIDATE_US_REALM_HEADER_V4_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get() == null) {

			OCL.Helper helper = EOCL_ENV.get().createOCLHelper();
			helper.setContext(ConsolPackage.Literals.US_REALM_HEADER_V4);
			try {
				VALIDATE_US_REALM_HEADER_V4_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.set(
					helper.createInvariant(VALIDATE_US_REALM_HEADER_V4_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP));
			} catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}

		if (!EOCL_ENV.get().createQuery(
			VALIDATE_US_REALM_HEADER_V4_PARTICIPANT1__DIAGNOSTIC_CHAIN_MAP__EOCL_INV.get()).check(usRealmHeaderV4)) {
			if (diagnostics != null) {
				diagnostics.add(
					new BasicDiagnostic(
						Diagnostic.WARNING, ConsolValidator.DIAGNOSTIC_SOURCE,
						ConsolValidator.US_REALM_HEADER_V4__US_REALM_HEADER_V4_PARTICIPANT1,
						ConsolPlugin.INSTANCE.getString("USRealmHeaderV4USRealmHeaderV4Participant1"),
						new Object[] { usRealmHeaderV4 }));
			}

			return false;
		}
		return true;
	}

} // USRealmHeaderV4Operations
