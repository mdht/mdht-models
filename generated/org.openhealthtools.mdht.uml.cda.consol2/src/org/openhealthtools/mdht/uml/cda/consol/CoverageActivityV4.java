/**
 */
package org.openhealthtools.mdht.uml.cda.consol;

import java.util.Map;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.mdht.emf.runtime.util.Initializer;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coverage Activity V4</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.consol.ConsolPackage#getCoverageActivityV4()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='CoverageActivity2TemplateId CoverageActivityV4IVLTSValue' templateId.root='2.16.840.1.113883.10.20.22.4.60' templateId.extension='2023-05-01' constraints.validation.warning='CoverageActivityV4EffectiveTime' constraints.validation.query='CoverageActivityV4IVLTSValue'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/consolCoverageActivityV4IVLTS constraints.validation.error='CoverageActivityV4IVLTSValue'"
 *        annotation="duplicates"
 * @generated
 */
public interface CoverageActivityV4 extends CoverageActivity2 {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())'"
	 * @generated
	 */
	boolean validateCoverageActivityV4EffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.effectiveTime-&gt;excluding(null)-&gt;select(isNullFlavorUndefined())-&gt;reject( ( isNullFlavorUndefined() implies (not value.oclIsUndefined() )))'"
	 * @generated
	 */
	boolean validateCoverageActivityV4IVLTSValue(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageActivityV4 init();

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageActivityV4 init(Iterable<? extends Initializer<? extends EObject>> initializers);
} // CoverageActivityV4
