/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.lang.Iterable;
import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Activity2</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getCoverageActivity2()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='CoverageActivity2TemplateId CoverageActivityCode CoverageActivityCodeP CoverageActivityPolicyActivity CoverageActivity2EntryRelationship CoverageActivity2EntryRelationshipINTValue CoverageActivity2EntryRelationshipTypeCode CoverageActivity2EntryRelationshipPolicyActivity2' templateId.root='2.16.840.1.113883.10.20.22.4.60' templateId.extension='2015-08-01' constraints.validation.info='CoverageActivityCoverageActivityRelationshipSequenceNumber CoverageActivity2EntryRelationshipSequenceNumber' constraints.validation.dependOn.CoverageActivityCode='CoverageActivityCodeP' constraints.validation.query='CoverageActivity2EntryRelationshipINTValue CoverageActivity2EntryRelationshipTypeCode CoverageActivity2EntryRelationshipSequenceNumber CoverageActivity2EntryRelationshipPolicyActivity2'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCoverageActivity2EntryRelationship typeCode='COMP' constraints.validation.error='CoverageActivity2EntryRelationshipTypeCode CoverageActivity2EntryRelationshipPolicyActivity2 CoverageActivity2EntryRelationshipINTValue' constraints.validation.info='CoverageActivity2EntryRelationshipSequenceNumber' constraints.validation.query='CoverageActivity2EntryRelationshipINTValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCoverageActivity2EntryRelationshipINT constraints.validation.error='CoverageActivity2EntryRelationshipINTValue'"
 *        annotation="duplicates"
 * @generated
 */
public interface CoverageActivity2 extends CoverageActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId-&gt;exists(id : datatypes::II | id.root = \'2.16.840.1.113883.10.20.22.4.60\' and id.extension.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCoverageActivity2TemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCoverageActivityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
	 * @generated
	 */
	boolean validateCoverageActivity2EntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null).sequenceNumber-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (not value.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateCoverageActivity2EntryRelationshipINTValue(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;reject(typeCode=vocab::x_ActRelationshipEntryRelationship::COMP)'"
	 * @generated
	 */
	boolean validateCoverageActivity2EntryRelationshipTypeCode(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;reject((sequenceNumber.oclIsUndefined() or sequenceNumber.isNullFlavorUndefined()) implies (not sequenceNumber.oclIsUndefined()))'"
	 * @generated
	 */
	boolean validateCoverageActivity2EntryRelationshipSequenceNumber(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship-&gt;excluding(null)-&gt;reject(act-&gt;one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PolicyActivity2)))'"
	 * @generated
	 */
	boolean validateCoverageActivity2EntryRelationshipPolicyActivity2(DiagnosticChain diagnostics,
			Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @model kind="operation" required="true" ordered="false"
	 *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()-&gt;select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::PolicyActivity2)).oclAsType(consol::PolicyActivity2)'"
	 * @generated
	 */
	EList<PolicyActivity2> getConsolPolicyActivity2s();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageActivity2 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageActivity2 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CoverageActivity2
